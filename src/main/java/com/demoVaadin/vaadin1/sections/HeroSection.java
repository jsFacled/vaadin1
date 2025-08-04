package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class HeroSection extends VerticalLayout {
 public HeroSection() {
        setId(SectionId.HERO.get());
        addClassNames("hero", "section");

     Div content = new Div();
     content.addClassName("hero-content");

     H1 title = new H1("Transformá tus ideas en soluciones digitales");
        Paragraph subtitle = new Paragraph("Diseñamos, desarrollamos y optimizamos sitios web, aplicaciones móviles y plataformas en la nube para impulsar el crecimiento de tu negocio");

        Button cta = new Button("Hablemos de tu idea →");
        cta.addClassName("cta-button");

     content.add(title, subtitle, cta);
     add(content);
    }
}
