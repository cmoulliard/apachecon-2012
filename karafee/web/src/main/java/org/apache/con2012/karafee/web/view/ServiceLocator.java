package org.apache.con2012.karafee.web.view;

import org.apache.con2012.karafee.service.ConferenceService;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 */
@Startup
@Singleton
public class ServiceLocator {

    @Inject
    private ConferenceService conferenceService;

    public ServiceLocator() {
    }

    public ConferenceService getConferenceService() {
        return conferenceService;
    }

}
