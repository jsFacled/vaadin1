package com.demoVaadin.vaadin1.pruSections.heroPruebas;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;

public class PruHeroSection3 extends Div {
 public PruHeroSection3() {

     addClassNames("hs3", "hs-pru");
     Div content = new Div();
     content.addClassName("hs3-content");

     H1 title = new H1("Transformá tus ideas en soluciones digitales");
     Paragraph subtitle = new Paragraph("Diseñamos, desarrollamos y optimizamos sitios web, aplicaciones móviles y plataformas en la nube para impulsar el crecimiento de tu negocio");
     Button cta = new Button("Hablemos de tu idea →");
     cta.addClassName("cta-button");

     content.add(title, subtitle, cta);
     add(content);
    }
}
