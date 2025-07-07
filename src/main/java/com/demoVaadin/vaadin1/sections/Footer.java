package com.demoVaadin.vaadin1.sections;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class Footer extends VerticalLayout {
    public Footer() {
        this.setId("footer");
        this.addClassName("footer");

    add(new H2("FOOTER"));
    add(new Paragraph("@NETICWARE 2025"));
    add(new Paragraph("Todos los derechos Reservados."));
    }
}
