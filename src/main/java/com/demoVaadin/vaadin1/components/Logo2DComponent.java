package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class Logo2DComponent extends FlexLayout {

    public Logo2DComponent() {
        setAlignItems(Alignment.CENTER);
        getStyle().set("flex-wrap", "wrap");

        addClassName("logo"); // bloque principal
        setWidthFull();
        setHeight("80px");

        Image logoImg = new Image("images/Icono-sinFondo-ChatGPT.png", "Neticware icon");
        logoImg.addClassNames("logo__icon", "logo__icon--2d", "logo__icon--animated");
        logoImg.setHeight("40px");

        Anchor logoLink = new Anchor("#hero", logoImg);
        logoLink.addClassName("logo__link");

        Span nombre = new Span("neticware");
        nombre.addClassName("logo__text");

        add(logoLink, nombre);
    }
}
