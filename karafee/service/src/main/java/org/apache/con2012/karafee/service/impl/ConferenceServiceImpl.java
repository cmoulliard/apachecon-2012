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
package org.apache.con2012.karafee.service.impl;

import org.apache.con2012.karafee.dao.ConferenceRepository;
import org.apache.con2012.karafee.model.Conference;
import org.apache.con2012.karafee.service.ConferenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.inject.Inject;
import java.util.List;

@Lock(LockType.READ)
@Singleton
public class ConferenceServiceImpl implements ConferenceService {
    
    private static final Logger LOG = LoggerFactory.getLogger(ConferenceServiceImpl.class);

    @Inject
    private ConferenceRepository conferenceRepository;

    public void store(Conference conference) {
        conferenceRepository.store(conference);
    }

    public void delete(long id) {
        conferenceRepository.delete(id);
    }

    public Conference findById(long id) {
        return conferenceRepository.findById(id);
    }

    public List<Conference> findAll() {
        return conferenceRepository.findAll();
    }

    @Override
    public List<Conference> findAll(int first, int count) {
        return conferenceRepository.findAll(first, count);
    }

    public List<Conference> findByKey(String key) {
        return conferenceRepository.findByKey(key);
    }

}
