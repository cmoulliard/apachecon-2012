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
package org.apache.con2012.karafee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@NamedQueries({
        @NamedQuery(name = "Conference.findAll", query = "select i from Conference  i"),
        @NamedQuery(name = "Conference.findByKey", query = "select i from Conference  i where i.ref = :key")
})
@Entity
@Table(name = "T_CONFERENCE")
public class Conference extends EntityWithToString implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CONFERENCE_ID")
    private long id;

    @Column(name = "REF", length = 55)
    private String ref;

    @Column(name = "GIVEN_NAME", length = 35)
    private String givenName;

    @Column(name = "FAMILY_NAME", length = 35)
    private String familyName;

    @Column(name = "SUMMARY", length = 80)
    private String summary;

    @Column(name = "DETAILS")
    private String details;

    @Column(name = "EMAIL", length = 60)
    private String email;

    @Column(name = "PHONE", length = 35)
    private String phone;

    @Temporal(TemporalType.DATE)
    @Column(name = "CONFERENCE_DATE")
    private Date date;

    @Column(name = "CREATION_USER")
    private String creationUser;

    public long getId() {
        return id;
    }

    public void setId(long cId) {
        this.id = cId;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String cRef) {
        this.ref = cRef;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date cDate) {
        this.date = cDate;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

}
