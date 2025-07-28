package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class Logo2DComponent extends HorizontalLayout {

    public Logo2DComponent(String animationClass)) {
        addClassName("logo");
        setSpacing(true); // Añade espacio entre el icono y el texto
        setAlignItems(Alignment.CENTER);//Aliniación vertical:centrado
        setPadding(false);
        setMargin(false);

        //Contenedor del icon
        Div iconContainer = new Div();
        iconContainer.addClassName("logo__iconContainer");
        Image icon = new Image("images/Icono-sinFondo-ChatGPT.png", "Neticware Logo");
        icon.addClassNames("logo__icon",  animationClass);
        Anchor logoLink = new Anchor("/", icon);
        logoLink.addClassName("logo__link");
        iconContainer.add(logoLink);

        // TEXTO
        Span name = new Span("neticware");
        name.addClassName("logo__name");

        Span description = new Span("SOFTWARE DEVELOPMENT");
        description.addClassName("logo__description");

        //// Contenedor vertical para el texto
        VerticalLayout textGroup = new VerticalLayout(name, description);
        textGroup.addClassName("logo__text-group");
        textGroup.setAlignItems(Alignment.START); // Alinea el texto a la izquierda
        textGroup.setJustifyContentMode(JustifyContentMode.CENTER); // Centra verticalmente
        textGroup.setSpacing(false); // No añadir espacios entre nombre y descripción

        //textGroup.setPadding(false);
        //textGroup.setSpacing(false);
        //textGroup.setMargin(false);


        // opcional para asegurar no colapsar
        setFlexGrow(0, iconContainer);
        setFlexGrow(1, textGroup);
        setWidth(null);

       add(iconContainer, textGroup);

        /*
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

        Span nombre = new Span("neticware ");
        nombre.addClassName("logo__name");

        Span logoDescription = new Span("SOFTWARE DEVELOPMENT");
        logoDescription.addClassName("logo__description");

        add(logoLink, nombre,logoDescription);


         */
    }

}
