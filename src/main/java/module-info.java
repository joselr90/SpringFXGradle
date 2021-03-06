module com.example.template {
    requires java.base;
    requires java.logging;
    requires java.sql;
    requires java.xml;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.beans;
    requires spring.core;

    requires spring.web;
    requires spring.webmvc;

    requires java.annotation;

    exports com.example.template;
    opens com.example.template to javafx.fxml, javafx.graphics, javafx.controls, spring.beans, spring.context, spring.core,  spring.web, spring.webmvc,  spring.boot.autoconfigure,java.sql,java.xml,java.logging,java.desktop,java.annotation;
    exports com.example.template.beans;
    opens com.example.template.beans to java.annotation, java.desktop, java.logging, java.sql, java.xml, javafx.controls, javafx.fxml, javafx.graphics, spring.beans, spring.boot.autoconfigure, spring.context, spring.core, spring.web, spring.webmvc;
    exports com.example.template.model;
    opens com.example.template.model to java.annotation, java.desktop, java.logging, java.sql, java.xml, javafx.controls, javafx.fxml, javafx.graphics, spring.beans, spring.boot.autoconfigure, spring.context, spring.core, spring.web, spring.webmvc;
}