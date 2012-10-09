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

import org.apache.con2012.karafee.model.Conference;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 *  DAO Conference class
 */
@Lock(LockType.READ)
@Singleton
public class ConferenceRepository {

    @PersistenceContext(unitName = "apachecon2012")
    private EntityManager em;

    public Conference store(final Conference conference) {
        em.persist(conference);
        em.flush();
        return conference;
    }

    public void delete(final long id) {
        em.remove(id);
    }

    public Conference findById(long id) {
        return em.find(Conference.class, id);
    }

    public List<Conference> findAll() {
        return em.createNamedQuery("Conference.findAll", Conference.class).getResultList();
    }

    public List<Conference> findAll(final int first, final int count) {
        return em.createNamedQuery("Conference.findAll", Conference.class)
                    .setFirstResult(first)
                    .setMaxResults(count)
                    .getResultList();
    }

    public List<Conference> findByKey(final String key) {
        return em.createNamedQuery("Conference.findByKey", Conference.class)
                    .setParameter("key", key)
                    .getResultList();
    }

    public long countAll() {
        return em.createNamedQuery("Conference.countAll", Long.class).getSingleResult();
    }
}

