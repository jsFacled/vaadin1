package com.demoVaadin.vaadin1.views;


import com.demoVaadin.vaadin1.Layouts.MainLayout;
import com.demoVaadin.vaadin1.pruSections.heroPruebas.PruHeroSection2;
import com.demoVaadin.vaadin1.sections.Footer;
import com.demoVaadin.vaadin1.sections.HeroSection;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

// PruView.java
@Route(value = "pru", layout = MainLayout.class)
@PageTitle("Neticware - Prueba")
public class PruView extends VerticalLayout {
    public PruView() {
        setPadding(false);
        setSpacing(false);
        setMargin(false);

        add(
                new HeroSection(),
                new PruHeroSection2(),
                new Footer()
        );
    }
}
