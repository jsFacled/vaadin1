package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ServicesSection extends VerticalLayout {
    public ServicesSection() {
        setId(SectionId.SERVICES.get());

        add(new H2("Nuestros Servicios"));
        add(new Paragraph("• Desarrollo de aplicaciones web con Vaadin y Spring Boot."));
        add(new Paragraph("• Aplicaciones móviles."));
        add(new Paragraph("• Soluciones SaaS a medida."));
        add(new Paragraph("• Investigación en Machine Learning con Java (JSR-381, DeepNetts)."));
    }
}
