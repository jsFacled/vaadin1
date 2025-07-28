package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.components.Logo2DComponent;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Footer extends VerticalLayout {
    public Footer() {
        setId("footer");
        addClassName("footer");
        setAlignItems(Alignment.CENTER);
        setSpacing(true);

        add(new Logo2DComponent("logo__icon--footer-spin"));
        add(new Paragraph("Website | Mobile | SaaS "));
        add(new Paragraph("© 2025 NETICWARE | Desarrollo de Software | Todos los derechos reservados"));


    }
}
