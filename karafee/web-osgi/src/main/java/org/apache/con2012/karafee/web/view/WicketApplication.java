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

import org.apache.webbeans.config.WebBeansContext;
import org.apache.wicket.cdi.CdiConfiguration;
import org.apache.wicket.cdi.ConversationPropagation;
import org.apache.wicket.protocol.http.WebApplication;

import javax.enterprise.inject.spi.BeanManager;

/**
 * ApacheCon 2012 KarafEE - Wicket Demo
 */
public class WicketApplication extends WebApplication {

    public void init() {
        super.init();

        // don't call it now since if the app is nto deployed it will simply not be found
        // BeanManager bm = WebBeansContext.currentInstance().getBeanManagerImpl();

        // new CdiConfiguration(bm)
        //        .setPropagation(ConversationPropagation.NONBOOKMARKABLE)
        //        .configure(this);
    }

    public WicketApplication() {
    }

    @Override
    public Class<Homepage> getHomePage() {
        return Homepage.class;
    }

}
