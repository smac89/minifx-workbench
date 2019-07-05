module minifx.core {
    exports org.minifx.workbench;
    exports org.minifx.workbench.annotations;
    exports org.minifx.workbench.components;
    exports org.minifx.workbench.conf;
    exports org.minifx.workbench.css;
    exports org.minifx.workbench.domain;
    exports org.minifx.workbench.domain.definition;
    exports org.minifx.workbench.nodes;
    exports org.minifx.workbench.nodes.creators;
    exports org.minifx.workbench.providers;
    exports org.minifx.workbench.spring;
    exports org.minifx.workbench.util;
    exports org.minifx.fxcommons;
    exports org.minifx.fxcommons.fxml.commons.spring;
    exports org.minifx.fxcommons.service;
    exports org.minifx.fxcommons.util;

    opens org.minifx.workbench.conf to spring.core,spring.beans;
    opens org.minifx.fxcommons.fxml.commons.spring to spring.core;

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.web;
    requires javafx.swing;

    requires spring.context;
    requires spring.beans;
    requires spring.core;

    requires com.google.common;
    requires minifx.fxml;

    requires de.jensd.fx.fontawesomefx.fontawesome;

    requires java.annotation;

    requires org.apache.commons.lang3;

//    requires java.desktop;
    requires org.slf4j;
}
