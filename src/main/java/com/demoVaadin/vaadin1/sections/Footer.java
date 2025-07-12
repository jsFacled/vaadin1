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

        add(new Logo2DComponent());
        add(new Paragraph("@NETICWARE 2025 - Todos los derechos Reservados"));


    }
}
