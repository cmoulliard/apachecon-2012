package org.apache.con2012.karafee.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.model.dataformat.CsvDataFormat;
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

    // BindyCsvDataFormat df = new BindyCsvDataFormat("org.apache.con2012.karafee.integration.model");

    /**
     * Let's configure the Camel routing rules using Java & CDI
     */
    public void configure() {

        CsvDataFormat csv = new CsvDataFormat();

        from("file://data/conference/?move=backup/${date:now:yyyyMMdd}/${file:name.noext}.bak&moveFailed=failed/${date:now:yyyyMMdd}")
          //.unmarshal().bindy(BindyType.Csv,"org.apache.con2012.karafee.integration.model")
          .unmarshal(csv)
          .to("direct:saveConference");

        from("direct:saveConference")
          .bean(mybean,"mapModel")
          .bean(mybean,"saveCsvConference");

        from("timer://apacheCon2012?fixedRate=true&period=25000")
          .setBody().simple(">> Hello to participants of ApacheCon 2012 Europe conferences")
          .bean(mybean,"sayHello");

    }

}
