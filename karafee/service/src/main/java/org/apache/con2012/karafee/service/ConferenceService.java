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
package org.apache.con2012.karafee.service;

import org.apache.con2012.karafee.model.Conference;

import java.util.List;

public interface ConferenceService {

    /**
     * Gets incident.
     * 
     * @param id the id
     * @return the incident
     */
    public Conference findById(long id);

    /**
     * Find all Incidents.
     * 
     * @return the list<org.apache.con2012.karafee.web.model.Conference>
     */
    public List<Conference> findAll();

    /**
     * Find org.apache.con2012.karafee.web.model.Conference by key ref.
     * 
     * @param key the key
     * @return the list< order>
     */
    public List<Conference> findByKey(String key);

    /**
     * Save org.apache.con2012.karafee.web.model.Conference.
     * 
     * @param conference the org.apache.con2012.karafee.web.model.Conference
     */
    public void store(Conference conference);

    /**
     * Removes the org.apache.con2012.karafee.web.model.Conference.
     * 
     * @param id the id
     */
    public void delete(long id);

}
