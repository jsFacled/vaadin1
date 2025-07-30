package com.demoVaadin.vaadin1;

import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.server.PWA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@Theme("nw-base")
@PWA(name = "Neticware Landing Page", shortName = "Neticware")
@Push

public class Vaadin1Application implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Vaadin1Application.class, args);
    }
}
