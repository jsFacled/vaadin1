package com.demoVaadin.vaadin1.pruSections.heroPruebas;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;

public class PruHeroSection2 extends Div {
    public PruHeroSection2() {
        setId(SectionId.HERO.get());
        addClassNames("hs2", "hs-pru");

        H1 title = new H1("Transformá tus ideas en soluciones digitales");

        Paragraph subtitle = new Paragraph("Diseñamos, desarrollamos y optimizamos sitios web, aplicaciones móviles y plataformas en la nube para impulsar el crecimiento de tu negocio");

        Button cta = new Button("Hablemos de tu idea →");
        cta.addClassName("hs2-cta");


        Div content = new Div(subtitle, cta);
        content.addClassName("hs2-content");

        add(title, content);
    }
}
