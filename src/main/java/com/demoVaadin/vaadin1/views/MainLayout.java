package com.demoVaadin.vaadin1.views;

import com.demoVaadin.vaadin1.components.HeaderComponent;
import com.demoVaadin.vaadin1.sections.*;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route("")
@PageTitle("Neticware - Home")
public class MainLayout extends AppLayout {

    public MainLayout() {
        // Header con logo, enlaces y menú responsive
        addToNavbar(new HeaderComponent());

        // Contenedor principal del cuerpo
        VerticalLayout body = new VerticalLayout();
        body.setPadding(false);
        body.setSpacing(false);
        body.setMargin(false);

        // Secciones internas de la landing page
        body.add(
                new HeroSection(),
                new ServicesSection(),
                new ProductsSection(),
                new AboutUsSection(),
                new CommunitySection(),
                new ContactSection(),
                new Footer()
        );

        // Agregar al contenido principal del layout
        setContent(body);
    }
}
