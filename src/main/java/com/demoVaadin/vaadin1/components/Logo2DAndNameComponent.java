package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class Logo2DAndNameComponent extends FlexLayout {

    public Logo2DAndNameComponent() {
        setAlignItems(Alignment.CENTER);
        getStyle().set("flex-wrap", "wrap");

        addClassName("logo-name-wrapper");
        setWidthFull();
        setHeight("80px");

        Image logoImg = new Image("images/Icono-sinFondo-ChatGPT.png", "Neticware logo");
        logoImg.addClassName("logo-animated");
        logoImg.setHeight("40px");

        Anchor logoLink = new Anchor("#hero", logoImg);
        logoLink.addClassName("logo-link");

        Span nombre = new Span("neticware");
        nombre.addClassName("logo-text");

        add(logoLink, nombre);
    }
}
