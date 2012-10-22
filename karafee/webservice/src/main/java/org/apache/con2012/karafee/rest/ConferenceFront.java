package org.apache.con2012.karafee.rest;

import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
@Path("/conference")
public class ConferenceFront {
    @GET
    public String name() {
        return "ApacheCon 2012";
    }
}
