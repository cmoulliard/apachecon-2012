package org.apache.con2012.karafee.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *   A Camel Route CDI managed
 */
@ContextName
@Startup
@ApplicationScoped
public class MyRouteBuilder extends RouteBuilder {

    @Inject
    MyBean mybean;

    /**
     * Let's configure the Camel routing rules using Java & CDI
     */
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
        from("file:apachecon2012/data?noop=true")
                .choice()
                .when(xpath("/person/city = 'Florennes'"))
                .to("file:target/messages/belgium")
                .otherwise()
                .to("file:target/messages/others");

        from("timer:test")
          .bean(mybean);
    }

}