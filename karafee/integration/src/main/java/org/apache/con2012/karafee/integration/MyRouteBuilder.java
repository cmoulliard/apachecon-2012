package org.apache.con2012.karafee.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.con2012.karafee.integration.model.ConferenceCsvModel;
import org.apache.con2012.karafee.service.ConferenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *   A Camel Route CDI managed
 */
@ContextName
@ApplicationScoped
public class MyRouteBuilder extends RouteBuilder {

    private static Logger logger = LoggerFactory.getLogger(MyRouteBuilder.class);

    @Inject
    MyBean mybean;

    /**
     * Let's configure the Camel routing rules using Java & CDI
     */
    public void configure() {

        BindyCsvDataFormat df = new BindyCsvDataFormat("org.apache.con2012.karafee.integration.model");

        from("file://data/conference/?move=backup/${date:now:yyyyMMdd}/${file:name.noext}.bak")
          .unmarshal(df)
          .to("direct:saveConference");

        from("direct:saveConference")
          .bean(mybean);

        from("timer://apacheCon2012?fixedRate=true&period=25000")
          .setBody().simple(">> Hello for ApacheCon 2012 conferences ....")
          .bean(mybean);

        /*
                from("file:apachecon2012/data?noop=true")
                .choice()
                .when(xpath("/person/city = 'Florennes'"))
                .to("file:target/messages/belgium")
                .otherwise()
                .to("file:target/messages/others");
         */

    }

}
