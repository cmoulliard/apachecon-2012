/**
 * Copyright OPS4J
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.con2012.karafee.web.util;

import org.apache.con2012.karafee.dao.ConferenceRepository;
import org.apache.con2012.karafee.model.Conference;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.text.ParseException;
import java.util.Date;

@Startup
@Singleton
public class DataLoader {

    @Inject
    private ConferenceRepository dao;

    @PostConstruct
    private void init() throws ParseException { // some provisioning
        // addConference("Moulliard", "Charles", "EE-1", "KarafEE - When OSGI modularity meets J2EE world (present and future)",
        //                new Date(), new Date(), "+11 22 33 44 55", "charles.moulliard@apache.org");
        // addConference("Manni-Bucau", "Romain", "EE-2", "KarafEE - When OSGI modularity meets J2EE world (present and future)",
        //        new Date(), new Date(), "+11 22 33 44 56", "rmannibucau@apache.org");
        // addConference("Blevins", "David", "EE-3", "Apache TomEE, Java EE 6 Web Profile on Tomcat",
        //        new Date(), new Date(), "+11 22 33 44 57", "david.blevins@apache.org");


        addConference2("211","Choosing the right tool for your data analysis task - Apache Mahout in context","Isabel Drost-Fromm","Big Data","Nov-7-2012");
        addConference2("062","Taking the guesswork out of your Hadoop Infrastructure","Steve Watt","Big Data","Nov-6-2012");
        addConference2("090","Extending lifespan with Hadoop and R","Radek Maciaszek","Big Data","Nov-6-2012");
        addConference2("091","From Incubation to Continuous Ingestion - The Story of Apache Gora","Lewis JohnMcGibbney","Big Data","Nov-7-2012");
        addConference2("114","Machine learning with Apache Hama","Tommaso Teofili","Big Data","Nov-7-2012");
        addConference2("123","HBase Sizing and Schema Design","Lars George","Big Data","Nov-6-2012");
        addConference2("145","Inside hadoop-dev","Steve Loughran","Big Data","Nov-6-2012");
        addConference2("180","Operating HBase: Things You Need to Know","Christian Gügi","Big Data","Nov-6-2012");
        addConference2("210","Cassandra and Hadoop: Combining Realtime and Analytics for Big Data","Sam Tunnicliffe","Big Data","Nov-6-2012");
        addConference2("165","Hadoop YARN - Under the Hood","sharad agarwal","Big Data","Nov-6-2012");
        addConference2("203","Enabling Elastic, Multi-tenant, Highly Available Hadoop on Demand","Richard McDougall","Big Data","Nov-6-2012");
        addConference2("106","Cassandra concepts, patterns and anti-patterns","Dave Gardner","Big Data","Nov-7-2012");
        addConference2("014","Big Search with Big Data Principles","Eric Pugh","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("096","Stump The Chump: On The Spot Solutions To Your Real Life Solr/Lucene Challenges","Chris Hostetter","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("097","Boosting & Biasing: Using Domain Knowledge and User Analytics in Apache Solr","Chris Hostetter","Lucene, SOLR & Friends","Nov-8-2012");
        addConference2("100","Lucene 4 Performance Tuning","Simon Willnauer","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("103","Compound Terms Query Parser for Great Shopping Experience","Mikhail Khludnev","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("125","Parallelize and improve your JUnit tests with randomized testing package","Dawid Weiss","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("140","ElasticSearch in Production: lessons learned","Anne Veling","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("181","Personalized Search on the Largest Flash Sale Site in America","Adrian Trenaman","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("198","What are we working on?","Robert Muir","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("215","Solr 4: The SolrCloud Architecture","Mark Miller","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("224","Battle of the giants: Apache Solr 4.0 vs ElasticSearch","Rafał Kuć","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("031","Large scale crawling with Apache Nutch","Julien Nioche","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("119","Searching relational like data with Lucene","Martijn vanGroningen","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("201","Query Parsing - Tips and Tricks","Erik Hatcher","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("202","Flexible Distributed Reporting for Millions of Publishers and Advertisers powered by Hadoop & Lucene","Dragan Milosevic","Lucene, SOLR & Friends","Nov-8-2012");
        addConference2("230","SolrCloud Round Table","Mark Miller","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("158","Content extraction with Apache Tika","Jukka Zitting","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("195","CMS Integration of Apache Solr - How we did it.","Ingo Renner","Lucene, SOLR & Friends","Nov-8-2012");
        addConference2("132","Is your index reader really atomic or maybe slow?","Uwe Schindler","Lucene, SOLR & Friends","Nov-7-2012");
        addConference2("169","Fundamentals of Information Retrieval, Illustration with Apache Lucene","Majirus FANSI","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("126","Text categorization with Lucene and Solr","Tommaso Teofili","Lucene, SOLR & Friends","Nov-8-2012");
        addConference2("025","How to REALLY measure Community Health","Jim Jagielski","Community","Nov-6-2012");
        addConference2("052","Write A Better FM","Rich Bowen","Community","Nov-7-2012");
        addConference2("079","bringing open-source to space, challenges and success","Luc Maisonobe","Community","Nov-7-2012");
        addConference2("173","Can I depend on Software built By Volunteers?","Ross Gardler","Community","Nov-7-2012");
        addConference2("175","Managing project risk when using open source","Ross Gardler","Community","Nov-7-2012");
        addConference2("205","Open source masterclass - Life in the Apache Incubator","Jukka Zitting","Community","Nov-7-2012");
        addConference2("216","I was voted to be committer. Now what?","Isabel Drost-Fromm","Community","Nov-7-2012");
        addConference2("226","Behind the Scenes of The Apache Software Foundation","Lars Eilebrecht","Community","Nov-6-2012");
        addConference2("010","Scripting Apache OpenOffice","Rony G.Flatscher","Open Office","Nov-8-2012");
        addConference2("029","Beyond Apache OpenOffice","Don Harbison","Open Office","Nov-7-2012");
        addConference2("050","User initiative for improving OOXML integration in LibreOffice/Apache Open Office","Matthias Stürmer","Open Office","Nov-8-2012");
        addConference2("065","Apache OpenOffice Automated Testing ","Liu Zhe","Open Office","Nov-8-2012");
        addConference2("067","Integration OpenSocial with Apache OpenOffice","DaLi Liu","Open Office","Nov-7-2012");
        addConference2("069","Change Tracking in AOO and ODF","Oliver-Rainer Wittmann","Open Office","Nov-6-2012");
        addConference2("070","Why We Need A New Slide Show","Andre Fischer","Open Office","Nov-7-2012");
        addConference2("072","Moving the DrawingLayer component of Apache OpenOffice to the future - the next step (branch aw080)","Armin LeGrand","Open Office","Nov-6-2012");
        addConference2("078","Apache OpenOffice Accessibility","Steve Yin","Open Office","Nov-6-2012");
        addConference2("094","Cloud Apache OpenOffice.org Based on HTML 5","Jian HongCheng","Open Office","Nov-7-2012");
        addConference2("147","Balancing packaging and IP clearance in AOO FreeBSD\'s port","Pedro Giffuni","Open Office","Nov-7-2012");
        addConference2("162","Globalization of OpenOffice - reach out to the world","Juergen Schmidt","Open Office","Nov-7-2012");
        addConference2("166","Native-language communities around OpenOffice","Andrea Pescetti","Open Office","Nov-7-2012");
        addConference2("170","OpenOffice at Apache","Juergen Schmidt","Open Office","Nov-6-2012");
        addConference2("238","DOCX Export In AOO","Weike Liang","Open Office","Nov-8-2012");
        addConference2("240","OpenOffice Extensions and Templates","Roberto Galoppini","Open Office","Nov-6-2012");
        addConference2("081","What Apache Stanbol can Do for You","Fabian Christ","Linked Data","Nov-7-2012");
        addConference2("086","Extracting Custom Entities with the Stanbol Enhancer","Rupert Westenthaler","Linked Data","Nov-7-2012");
        addConference2("135","Writing a Semantic Web with Scala on Clerezza","Reto Bachmann-Gmür","Linked Data","Nov-7-2012");
        addConference2("197","Solr-based search & tagging services at ZEIT Online GmbH - where metadata come from","Christoph Goller","Linked Data","Nov-8-2012");
        addConference2("157","Jena based Implementation of a ISO 11179 Meta-data Registry","Ali AnilSinaci","Linked Data","Nov-7-2012");
        addConference2("220","Handling RDF data with tools from the Hadoop ecosystem","Paolo Castagna","Linked Data","Nov-7-2012");
        addConference2("152","Semantic Indexing and Search for Content Management Systems","Suat Gonul","Linked Data","Nov-8-2012");
        addConference2("212","Publishing Linked Data - Lessons Learned in Government","Nandana Mihindukulasooriya","Linked Data","Nov-8-2012");
        addConference2("068","The Landscape of Platform Topics of Apache OpenOffice","Herbert Duerr","Open Office","Nov-7-2012");
        addConference2("051","What\'s new in Apache HTTP Server 2.4","Rich Bowen","Web Infrastructure","Nov-6-2012");
        addConference2("222","Securing Communications with the Apache HTTP Server","Lars Eilebrecht","Web Infrastructure","Nov-6-2012");
        addConference2("139","Performance: Scaling the Web with Apache","Igor Galić","Web Infrastructure","Nov-6-2012");
        addConference2("019","Apache Tomcat & Reverse Proxies","Mark Thomas","Web Infrastructure","Nov-7-2012");
        addConference2("092","Using Apache Portable Runtime and Tomcat Native to as a NIO library for XMPP server","Sergey Vladimirov","Web Infrastructure","Nov-7-2012");
        addConference2("013","mod_rewrite Boot Camp","Rich Bowen","Web Infrastructure","Nov-6-2012");
        addConference2("172","Apache HTTP Server 2.4 Problem Diagnosis","Jeff Trawick","Web Infrastructure","Nov-6-2012");
        addConference2("017","Cloudy Fortress: Proxying for Security","Nick Kew","Web Infrastructure","Nov-6-2012");
        addConference2("046","Cloud4All - automatic personalised access","Steve Lee","Web Infrastructure","Nov-6-2012");
        addConference2("228","Policing the RFC: How Not To Kill Your Website at Scale","Graham Leggett","Web Infrastructure","Nov-6-2012");
        addConference2("178","Interfacing Apache HTTP Server 2.4 with External Applications","Jeff Trawick","Web Infrastructure","Nov-6-2012");
        addConference2("043","Building WebSockets Applications using Tomcat, Wicket and the Atmosphere Framework","Jean-Francois Arcand","Web Infrastructure","Nov-7-2012");
        addConference2("012","Apache Camel - Advanced Techniques","Hadrian Zbarcea","Camel in Action","Nov-8-2012");
        addConference2("022","Apollo and future of ActiveMQ","Dejan Bosanac","Camel in Action","Nov-8-2012");
        addConference2("041","Next Generation – Systems Integration in the Cloud Era with Apache Camel","Kai Wähner","Camel in Action","Nov-8-2012");
        addConference2("159","When Camel meets CDI","Łukasz Dywicki","Camel in Action","Nov-8-2012");
        addConference2("008","Apache Camel in Action - Common Problems, Solutions and Best Practices","Christian Müller","Camel in Action","Nov-8-2012");
        addConference2("104","Handling Realtime Item Availability in eShop","Mikhail Khludnev","Lucene, SOLR & Friends","Nov-8-2012");
        addConference2("021","Refurbished wheels still round - the rise of reusable components in ASF","Simone Tripodi","Apache Daily","Nov-8-2012");
        addConference2("160","The secrets of a file","Jukka Zitting","Apache Daily","Nov-8-2012");
        addConference2("044","Unit- and Integration Testing with Maven","Karl-Heinz Marbaise","Apache Daily","Nov-8-2012");
        addConference2("179","Virtualized & Distributed testing","Karthick R","Apache Daily","Nov-8-2012");
        addConference2("098","World of Logging","Christian Grobmeier","Apache Daily","Nov-8-2012");
        addConference2("121","Faster builds with Apache Buildr","Tammo vanLessen","Apache Daily","Nov-8-2012");
        addConference2("026","What s New At Apache","Jim Jagielski","Community","Nov-6-2012");
        addConference2("187","OSGi for mere mortals","Bertrand Delacretaz","Modular Java Applications","Nov-7-2012");
        addConference2("130","OSGi in the Cloud, a case study","Marcel Offermans","Modular Java Applications","Nov-7-2012");
        addConference2("156","Felix Connect","Karl Pauls","Modular Java Applications","Nov-7-2012");
        addConference2("177","Scripting languages in OSGi","Frank Lyaruu","Modular Java Applications","Nov-8-2012");
        addConference2("153","Native-OSGi, Modular Software Development in a Native world","A Broekhuis","Modular Java Applications","Nov-8-2012");
        addConference2("149","Managing Installations and Provisioning of OSGi Applications","Carsten Ziegeler","Modular Java Applications","Nov-8-2012");
        addConference2("034","Multiple Apache Karaf instance with Cellar","Jean-Baptiste Onofré","Modular Java Applications","Nov-8-2012");
        addConference2("080","OSGi best practices shown on Apache Karaf","Christian Schneider","Modular Java Applications","Nov-7-2012");
        addConference2("061","Virtual Nodes: Rethinking Topology in Cassandra","Eric Evans","NoSQL Database","Nov-7-2012");
        addConference2("124","HBase Status Quo","Lars George","NoSQL Database","Nov-7-2012");
        addConference2("185","The CouchDB Ecosystem","Jan Lehnardt","NoSQL Database","Nov-6-2012");
        addConference2("190","The CouchDB Implementation","Jan Lehnardt","NoSQL Database","Nov-8-2012");
        addConference2("206","Mongo, its all the Rave","Matt Franklin","NoSQL Database","Nov-7-2012");
        addConference2("208","Cassandra 2012: What s New and Upcoming","Sam Tunnicliffe","NoSQL Database","Nov-7-2012");
        addConference2("184","CouchDB Grows Up","Jan Lehnardt","NoSQL Database","Nov-7-2012");
        addConference2("018","Tomcat 8 preview","Mark Thomas","ApacheEE","Nov-6-2012");
        addConference2("009","CDI with Apache OpenWebBeans","Mark Struberg","ApacheEE","Nov-6-2012");
        addConference2("027","Advanced CDI with Apache DeltaSpike","Mark Struberg","ApacheEE","Nov-6-2012");
        addConference2("134","Apache TomEE, Java EE 6 Web Profile on Tomcat","David Blevins","ApacheEE","Nov-6-2012");
        addConference2("207","MyFaces -50% RAM","Leonardo Uribe","ApacheEE","Nov-6-2012");
        addConference2("171","Modern Web Application Development With Apache Struts 2","René Gielen","ApacheEE","Nov-6-2012");
        addConference2("144","Wicket - where do we go from here?","Sven Meier","ApacheEE","Nov-6-2012");
        addConference2("048","An introduction to Apache Flex","Justin Mclean","ApacheEE","Nov-6-2012");
        addConference2("047","Open Source Identity Management","Francesco Chicchiriccò","ApacheEE","Nov-6-2012");
        addConference2("116","Domain-driven apps with Apache Isis","Mohammad Nour","ApacheEE","Nov-7-2012");
        addConference2("161","KarafEE - When OSGI modularity meets J2EE world (present and future)","Charles Moulliard","ApacheEE","Nov-7-2012");
        addConference2("007","Project Mgt with OFBiz","Pierre Smits","OFBiz","Nov-6-2012");
        addConference2("030","Addons goals, howto use, howto manage","Olivier Heintz","OFBiz","Nov-7-2012");
        addConference2("064","OFBiz – an eCommerce Solution for mid- to large-sized companies ","Paul Piper","OFBiz","Nov-7-2012");
        addConference2("076","OFBiz - Framework Overview","Sascha Rodekamp","OFBiz","Nov-6-2012");
        addConference2("077","Multi-Store eCommerce with Apache OFBiz","Sascha Rodekamp","OFBiz","Nov-6-2012");
        addConference2("109","ofbizextra-addons, what constrains for each repository","Olivier Heintz","OFBiz","Nov-8-2012");
        addConference2("110","Training Center Management with OFBiz","Olivier Heintz","OFBiz","Nov-8-2012");
        addConference2("112","OFBiz CRM, presentation, functionalities","Olivier Heintz","OFBiz","Nov-8-2012");
        addConference2("107","What is new in CloudStack 4.0?","Wido denHollander","Cloud","Nov-6-2012");
        addConference2("015","Open Clouds with Deltacloud API","Michal Fojtik","Cloud","Nov-6-2012");
        addConference2("074","Apache CloudStack Scalability","Kevin Kluge","Cloud","Nov-6-2012");
        addConference2("122","Deltacloud and cloud API standards","David Lutterkort","Cloud","Nov-6-2012");
        addConference2("146","Getting started with AMQP 1.0 using Apache Qpid","Rajith Attapattu","Cloud","Nov-6-2012");
        addConference2("154","Integration in the cloud - IPaaS with Fuse technology","Charles Moulliard","Cloud","Nov-6-2012");
        addConference2("225","Integrating Social Apps with Content Driven Sites using Apache Rave and Spring HMVC","Ate Douma","Cloud","Nov-7-2012");
        addConference2("231","Open source AMQP messaging with Apache Qpid","Doug Mahugh","Cloud","Nov-6-2012");
        addConference2("167","Building a scalable multi-tenant Application Server on the Cloud using Tomcat, Axis2 & Synapse","Senaka Fernando","Cloud","Nov-7-2012");
        addConference2("151","High Availability Hadoop  ","Steve Loughran","Big Data","Nov-6-2012");
        addConference2("219","Real-time Big Data in Practice with Cassandra","Michaël Figuière","Big Data","Nov-6-2012");
        addConference2("176","The Apache Way","Ross Gardler","Community","Nov-6-2012");
        addConference2("073","Introduction to Apache CloudStack","Kevin Kluge","Cloud","Nov-6-2012");
        addConference2("242","Securing Apache Tomcat","Mark Thomas","Web Infrastructure","Nov-6-2012");
        addConference2("221","Solr 4, the NoSQL database","Yonik Seeley","Lucene, SOLR & Friends","Nov-6-2012");
        addConference2("101","A Web Search Appliance with Solr and YaCy","Michael Christen","Lucene, SOLR & Friends","Nov-8-2012");
        addConference2("111","Multi resource Project Scheduling with OFBiz","Olivier Heintz","OFBiz","Nov-6-2012");
        addConference2("071","OpenOffice Build System","Andre Fischer","Open Office","Nov-8-2012");
        addConference2("113","Deepdive into deltacloud","Marios Andreou","Cloud","Nov-8-2012");

    }

    private void addConference(final String familyName, final String givenName, final String ref,
                               final String summary, final Date creationDate, final Date date,
                               final String phone, final String mail) {
        final Conference ic = new Conference();

        ic.setFamilyName(familyName);
        ic.setGivenName(givenName);
        ic.setRef(ref);
        ic.setSummary(summary);
        ic.setCreationDate(creationDate);
        ic.setDate(date);
        ic.setPhone(phone);
        ic.setEmail(mail);

        dao.store(ic);
    }

    private void addConference2(final String ref, final String summary, final String name, final String details, final String creationDate) {

        final Conference ic = new Conference();
        String[] tokens = name.split(" ");
        ic.setFamilyName(tokens[0]);
        ic.setGivenName(tokens[1]);
        ic.setRef(ref);
        ic.setSummary(summary);
        ic.setDetails(details);
        ic.setCreationDate(new Date());
        ic.setDate(new Date());
        ic.setPhone("+00 11 22 33 44 55");
        ic.setEmail("apache-conference@apahe.org");

        dao.store(ic);
    }
}
