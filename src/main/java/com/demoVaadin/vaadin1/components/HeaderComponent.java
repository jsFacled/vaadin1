package com.demoVaadin.vaadin1.components;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class HeaderComponent extends HorizontalLayout {

    public HeaderComponent() {
        // Logo como componente reutilizable
        Logo2DComponent logo = new Logo2DComponent();



        // Enlaces de navegación
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

        HorizontalLayout center = new HorizontalLayout(home, services, products, about, community, contact);
        center.setAlignItems(Alignment.CENTER);
        center.setJustifyContentMode(JustifyContentMode.CENTER);
        center.setWidthFull();

        // Header layout
        add(logo, center);
        setAlignItems(Alignment.CENTER);
        setSpacing(true);
        setWidthFull();
        addClassName("main-header");
    }
}
