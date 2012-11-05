package org.apache.con2012.karafee.integration;

import org.apache.camel.Body;
import org.apache.con2012.karafee.integration.model.ConferenceCsvModel;
import org.apache.con2012.karafee.model.Conference;
import org.apache.con2012.karafee.service.ConferenceService;

import javax.inject.Inject;

/**
 * Simple Bean/PoJo class
 */
public class MyBean {

    @Inject
    ConferenceService conferenceService;

    public void sayHello(String body) {
        System.out.println("Message received : " + body);
    }

    public void saveConference(@Body ConferenceCsvModel model) {

        // Map Bindy Model with Entity Model
        Conference entity = new Conference();
        entity.setId(model.getId());
        entity.setCreationUser(model.getCreationUser());
        entity.setDate(model.getDate());
        entity.setRef(model.getRef());
        entity.setSummary(model.getSummary());
        entity.setDetails(model.getDetails());
        entity.setEmail(model.getEmail());
        entity.setPhone(model.getPhone());
        entity.setFamilyName(model.getFamilyName());
        entity.setGivenName(model.getGivenName());

        // Save conference
        conferenceService.store(entity);

    }
}
