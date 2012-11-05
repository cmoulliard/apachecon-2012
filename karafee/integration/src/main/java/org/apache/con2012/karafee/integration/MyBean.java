package org.apache.con2012.karafee.integration;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.con2012.karafee.integration.model.ConferenceCsvModel;
import org.apache.con2012.karafee.model.Conference;
import org.apache.con2012.karafee.service.ConferenceService;

import javax.inject.Inject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Simple Bean/PoJo class
 */
public class MyBean {

    @Inject
    ConferenceService conferenceService;

    public void sayHello(String body) {
        System.out.println("Message received : " + body);
    }

    public List<Conference> mapModel(@Body List<List<String>> result) throws ParseException {

        List<Conference> confs = new ArrayList<Conference>();

        for (List<String> record : result) {
            Conference entity = new Conference();
            entity.setId(Long.getLong(record.get(0)));
            entity.setRef(record.get(1));
            entity.setFamilyName(record.get(2));
            entity.setGivenName(record.get(3));
            entity.setSummary(record.get(4));
            entity.setDetails(record.get(5));
            entity.setEmail(record.get(6));
            entity.setPhone(record.get(7));

            DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
            Date date = formatter.parse(record.get(8));

            entity.setDate(date);
            entity.setCreationUser(record.get(9));
            confs.add(entity);
        }
        return confs;

    }

    public void saveCsvConference(List<Conference> confs) {
        for(Conference conference : confs){
            conferenceService.store(conference);
        }
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
