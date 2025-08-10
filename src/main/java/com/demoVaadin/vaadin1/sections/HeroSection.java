package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class HeroSection extends VerticalLayout {

     public HeroSection() {
          setId(SectionId.HERO.get());
          addClassNames("hero");

          H1 title = new H1("Transformá tus ideas en soluciones digitales");

          Paragraph subtitle = new Paragraph(
                  "Diseñamos, desarrollamos y optimizamos sitios web, aplicaciones móviles y plataformas en la nube para impulsar el crecimiento de tu negocio"
          );

          Button ctaButton = new Button("Hablemos de tu idea →");
          ctaButton.addClassName("hero-cta");

          Anchor ctaLink = new Anchor("#contact", "");
          ctaLink.add(ctaButton);

          Div content = new Div(subtitle, ctaLink);
          content.addClassName("hero-content");

          add(title, content);
     }
}
