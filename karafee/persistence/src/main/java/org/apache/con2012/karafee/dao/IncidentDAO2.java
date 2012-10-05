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
package org.apache.con2012.karafee.dao;

import org.apache.con2012.karafee.model.Incident;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *  DAO Incident class
 */
public class IncidentDAO2
{

    private long count = 0;
    private HashMap<Long, Incident> incidents = new HashMap<Long, Incident>();

    public IncidentDAO2() {
        init();
    }

    private void init() {
        Incident ic = new Incident();
        ic.setIncidentId(count);
        ic.setFamilyName("Charles");
        ic.setGivenName("Moulliard");
        ic.setIncidentRef("123");
        ic.setSummary("ApcheCon 2012 is great");
        ic.setCreationDate(new Date());
        ic.setIncidentDate(new Date());
        ic.setPhone("+11 22 33 44 55");
        ic.setEmail("cmoulliard@apache.org");

        incidents.put(count, ic);
        count++;
    }

    public Incident saveIncident(Incident incident) {
        Incident ic = new Incident();
        ic.setIncidentId(count++);
        incidents.put(count, ic);
        return ic;
    }

    public void removeIncident(long id) {
        incidents.remove(id);
    }

    public Incident getIncident(long id) {
        return incidents.get(id);
    }

    public List<Incident> findIncident() {
        return new ArrayList<Incident>(incidents.values());
    }

    public List<Incident> findIncident(String key) {
        List<Incident> list = new ArrayList<Incident>();
        list.add(incidents.get(Long.getLong(key)));
        return list;
    }

}

