package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.demoVaadin.vaadin1.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class HeroSection extends VerticalLayout {
 public HeroSection() {
        setId(SectionId.HERO.get());
        addClassName("hero");

        H1 title = new H1("Transformá tus ideas en soluciones digitales");
        Paragraph subtitle = new Paragraph("Diseñamos, desarrollamos y optimizamos sitios web, aplicaciones móviles y plataformas en la nube para impulsar el crecimiento de tu negocio");

        Button cta = new Button("Hablemos de tu idea →");
        cta.addClassName("cta-button");

        add(title, subtitle, cta);
    }
}
