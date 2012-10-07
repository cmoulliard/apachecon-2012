/**
 * Copyright OPS4J
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.con2012.karafee.web.util;

import org.apache.con2012.karafee.dao.ConferenceRepository;
import org.apache.con2012.karafee.model.Conference;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.text.ParseException;
import java.util.Date;

@Startup
@Singleton
public class DataLoader {
    @Inject
    private ConferenceRepository dao;

    @PostConstruct
    private void init() throws ParseException { // some provisioning
        addConference("Moulliard", "Charles", "EE-1", "KarafEE - When OSGI modularity meets J2EE world (present and future)",
                        new Date(), new Date(), "+11 22 33 44 55", "charles.moulliard@apache.org");
        addConference("Blevins", "David", "EE-2", "Apache TomEE, Java EE 6 Web Profile on Tomcat",
                new Date(), new Date(), "+11 22 33 44 56", "david.blevins@apache.org");
    }

    private void addConference(final String familyName, final String givenName, final String ref,
                               final String summary, final Date creationDate, final Date date,
                               final String phone, final String mail) {
        final Conference ic = new Conference();

        ic.setFamilyName(familyName);
        ic.setGivenName(givenName);
        ic.setRef(ref);
        ic.setSummary(summary);
        ic.setCreationDate(creationDate);
        ic.setDate(date);
        ic.setPhone(phone);
        ic.setEmail(mail);

        dao.store(ic);
    }
}
