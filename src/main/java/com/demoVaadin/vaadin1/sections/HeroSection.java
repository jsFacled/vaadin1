package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.demoVaadin.vaadin1.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class HeroSection extends VerticalLayout {
    public HeroSection() {
        setId(SectionId.HERO.get());

        setAlignItems(Alignment.CENTER);
        setSpacing(true);
        getStyle().set("background", "linear-gradient(135deg, #1F6BFF, #8B5CF6)")
                .set("color", "white")
                .set("padding", "5em 2em");

        H1 title = new H1("Soluciones digitales poderosas con tecnología Java");
        title.getStyle().set("font-family", "Poppins, sans-serif");

        Paragraph subtitle = new Paragraph("Creamos aplicaciones web, móviles y SaaS inteligentes");

        Button cta = new Button("Explorá nuestros productos");
        cta.getStyle().set("background", "#1F6BFF")
                .set("color", "white")
                .set("border-radius", "8px");

        add(title, subtitle, cta);
    }
}
