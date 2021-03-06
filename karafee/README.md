# ApacheCon 2012 - Karaf EE demo

## Installation

* Download Karaf EE from -
* Launch KarafEE : bin/karafee
* Install demo

    ```
    addurl mvn:org.apache.con2012.karafee/repository/1.0/xml/features
    features:install apachecon2012
    features:install integration
    ```

## Database Setup

    STEP 1 : Open a DOS/UNIX console in the folder persistence/database

    STEP 2 : Download H2 Database (http://www.h2database.com/html/download.html) and install it

    STEP 3 : Start H2 Server using the bat or shell script

        ```./h2.sh &
         The H2 server is started and to manage the databases from your web browser, simply click on the
         following url http://localhost:8082/```

    STEP 4 : Next create the report database

    In the login.jsp screen, select Generic (H2) - Server
    Add as settings name : Generic H2 (Server) - Webinar
    and modify the JDBC url as such : jdbc:h2:tcp://localhost/~/apachecon2012
    Next click on "connect" and the screen to manage the reportdb appears

    STEP 5 : Create Schema and Tables using the script located in the file db/src/main/config/
    h2-script.sql

    Execute the scripts 1), 2) and 3) defined in this file

    Check that the records are well created using the command : SELECT * FROM APACHECON.T_CONFERENCE;

    DROP SCHEMA APACHECON;
    CREATE SCHEMA APACHECON;

    CREATE TABLE APACHECON.OPENJPA_SEQUENCE_TABLE (
        ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY,
        SEQUENCE_VALUE BIGINT NOT NULL
    );

    CREATE TABLE APACHECON.T_CONFERENCE (
         CONFERENCE_ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY,
         REF VARCHAR(55),
         CONFERENCE_DATE TIMESTAMP,
         GIVEN_NAME VARCHAR(35),
         FAMILY_NAME VARCHAR(35),
         SUMMARY VARCHAR(80),
         DETAILS VARCHAR(255),
         EMAIL VARCHAR(60),
         PHONE VARCHAR(35),
         CREATION_DATE TIMESTAMP,
         CREATION_USER VARCHAR(255)
    );

    INSERT INTO APACHECON.T_CONFERENCE (REF, CONFERENCE_DATE, GIVEN_NAME, FAMILY_NAME, SUMMARY, DETAILS, EMAIL, PHONE) VALUES ('001','2011-03-21','Charles','Moulliard','Conference-001','This is a Conference for ApacheCon 2012','cmoulliard@apache.org','+111 10 20 300');
    INSERT INTO APACHECON.T_CONFERENCE (REF, CONFERENCE_DATE, GIVEN_NAME, FAMILY_NAME, SUMMARY, DETAILS, EMAIL, PHONE) VALUES ('002','2011-03-22','David','Blevin','Conference-002','This is a Conference for ApacheCon 2012','dblevin@apache.org','+111 10 20 300');
    INSERT INTO APACHECON.T_CONFERENCE (REF, CONFERENCE_DATE, GIVEN_NAME, FAMILY_NAME, SUMMARY, DETAILS, EMAIL, PHONE) VALUES ('003','2011-03-23','Romain','Manni-Bucau','Conference-003','This is a Conference for ApacheCon 2012','rmanni@apache.org','+111 10 20 300');
    INSERT INTO APACHECON.T_CONFERENCE (REF, CONFERENCE_DATE, GIVEN_NAME, FAMILY_NAME, SUMMARY, DETAILS, EMAIL, PHONE) VALUES ('004','2011-03-24','Dejan','Bosaniac','Conference-004','This is a Conference for ApacheCon 2012','dbosaniac@apache.org','+111 10 20 300');
