package com.demoVaadin.vaadin1.components;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class NavbarComponent extends HorizontalLayout {

    public NavbarComponent() {
        addClassName("navbar");
        setSpacing(true);
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.END);
        setWidthFull();

        Anchor home      = new Anchor("#" + SectionId.HERO.get(), "Inicio");
        Anchor services  = new Anchor("#" + SectionId.SERVICES.get(), "Servicios");
        Anchor products  = new Anchor("#" + SectionId.PRODUCTS.get(), "Productos");
        Anchor about     = new Anchor("#" + SectionId.ABOUT.get(), "Sobre Nosotros");
        Anchor community = new Anchor("#" + SectionId.COMMUNITY.get(), "Comunidad");
        Anchor contact   = new Anchor("#" + SectionId.CONTACT.get(), "Contacto");

        for (Anchor link : new Anchor[]{home, services, products, about, community, contact}) {
            link.getStyle()
                    .set("color", "white")
                    .set("text-decoration", "none");
        }

        add(home, services, products, about, community, contact);
    }
}
