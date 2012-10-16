/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.con2012.karafee.web.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.con2012.karafee.model.Conference;
import org.apache.con2012.karafee.service.ConferenceService;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import javax.inject.Inject;
import java.util.Iterator;

/**
 * Homepage
 */
public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;
    private static final Log LOG = LogFactory.getLog(HomePage.class);

    //ServiceLocator sl = new ServiceLocator();
    //private ConferenceService conferenceService = sl.getConferenceService();

    @SpringBean
    private ConferenceService conferenceService;

    /**
     * Constructor that is invoked when page is invoked without a session.
     *
     * @param parameters
     *            Page parameters
     */
    public HomePage(final PageParameters parameters) {

        LOG.debug("Conference service : " + conferenceService);

        // Add the simplest type of label
        add(new Label("message", "List of conference coming from web services or file : "));

        // Add paging
        final DataView<Conference> dataView = new DataView<Conference>("simple", new ConferenceDataProvider()) {
            @Override
            public void populateItem(final Item item) {
                final Conference conference = (Conference) item.getModelObject();
                item.add(new Label("id", String.valueOf(conference.getId())));
                item.add(new Label("date", String.valueOf(conference.getDate())));
                item.add(new Label("ref", conference.getRef()));
                item.add(new Label("givenName", conference.getGivenName()));
                item.add(new Label("familyName", conference.getFamilyName()));
                item.add(new Label("summary", conference.getSummary()));
                item.add(new Label("details", conference.getDetails()));
                item.add(new Label("email", conference.getEmail()));
                item.add(new Label("phone", conference.getPhone()));
                item.add(new Label("creationUser", conference.getCreationUser()));
                item.add(new Label("creationDate", String.valueOf(conference.getCreationDate())));

                item.add(new AttributeModifier("class", new AbstractReadOnlyModel() {
                    @Override
                    public Object getObject() {
                        return (item.getIndex() % 2 == 1) ? "even" : "odd";
                    }
                }));
            }
        };

        dataView.setItemsPerPage(10);
        add(dataView);
        add(new PagingNavigator("navigator", dataView));

    }

    private class ConferenceDataProvider implements IDataProvider<Conference> {
        @Override
        public Iterator<Conference> iterator(final long first, final long count) {
            return conferenceService.findAll((int)first, (int)count).iterator();
        }

        @Override
        public long size() {
            return (int) conferenceService.totalNumber();
        }

        @Override
        public IModel<Conference> model(final Conference object) {
            return new Model<Conference>(object);
        }

        @Override
        public void detach() {
            // no-op
        }
    }

    private class ConferenceDetachModel extends LoadableDetachableModel {

        private long id;

        @Override
        protected Object load() {
            return conferenceService.findByKey(String.valueOf(id));
        }

        /**
         * @param i
         */
        public ConferenceDetachModel(Conference i) {
            this(i.getId());
        }

        public ConferenceDetachModel(long id) {

            if (id == 0) {
                throw new IllegalArgumentException();
            }
            this.id = id;
        }

    }

}
