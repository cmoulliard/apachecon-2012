package org.apache.con2012.karafee.integration.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.util.Date;

/**
 *  Camel CSV Bindy Model
 */

@CsvRecord(separator = ",")
public class ConferenceCsvModel {

    private static final long serialVersionUID = 1L;

    @DataField(pos = 1)
    private long id;

    @DataField(pos = 3)
    private String ref;

    @DataField(pos = 4)
    private String givenName;

    @DataField(pos = 5)
    private String familyName;

    @DataField(pos = 6)
    private String summary;

    @DataField(pos = 7)
    private String details;

    @DataField(pos = 8)
    private String email;

    @DataField(pos = 9)
    private String phone;

    @DataField(pos = 10, pattern = "dd-mm-yyyy")
    private Date date;

    @DataField(pos = 11)
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
