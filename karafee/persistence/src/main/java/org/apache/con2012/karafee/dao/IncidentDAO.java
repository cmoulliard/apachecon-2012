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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

@Singleton
@Lock(LockType.READ)
public class IncidentDAO {

  private static final Logger LOG = LoggerFactory.getLogger(IncidentDAO.class);

  @PersistenceContext(unitName = "reportIncident", type = PersistenceContextType.EXTENDED)
  private EntityManager em;
  private static final String findIncidentByReference = "select i from Incident as i where i.incidentRef = :ref";
  private static final String findIncident = "select i from Incident as i";

  public List<Incident> findIncident() {
    Query q = this.em.createQuery("select i from Incident as i");

    List list = q.getResultList();

    return list;
  }

  public List<Incident> findIncident(String key) {
    Query q = this.em.createQuery("select i from Incident as i where i.incidentRef = :ref");
    q.setParameter("ref", key);
    List list = q.getResultList();

    return list;
  }

  public Incident getIncident(long id) {
    return (Incident)this.em.find(Incident.class, Long.valueOf(id));
  }

  public void removeIncident(long id) {
    Object record = this.em.find(Incident.class, Long.valueOf(id));
    this.em.remove(record);
    this.em.flush();
  }

  public void saveIncident(Incident incident) {
    this.em.persist(incident);
    this.em.flush();
  }
}
