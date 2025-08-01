package com.demoVaadin.vaadin1.views;


import com.demoVaadin.vaadin1.pruSections.heroPruebas.PruHeroSection1;
import com.demoVaadin.vaadin1.pruSections.heroPruebas.PruHeroSection2;
import com.demoVaadin.vaadin1.pruSections.heroPruebas.PruHeroSection3;
import com.demoVaadin.vaadin1.sections.*;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("pru")
@PageTitle("Neticware - Prueba")

//@CssImport("themes/nw-base/hero-pruebas.css")
public class MainLayoutPruebas extends AppLayout {
    public MainLayoutPruebas(){

        // Header con logo, enlaces y menú responsive
        addToNavbar(new Header());

        // Contenedor principal del cuerpo
        VerticalLayout body = new VerticalLayout();
        body.setPadding(false);
        body.setSpacing(false);
        body.setMargin(false);



        // Secciones internas de la landing page
        body.add(
                new HeroSection(),
              new PruHeroSection1(),
               new PruHeroSection2(),
               new PruHeroSection3(),

               // new ServicesSection(),
               // new ProductsSection(),
             //   new AboutUsSection(),
             //   new CommunitySection(),
             //   new ContactSection(),
                new Footer()
        );

        // Agregar al contenido principal del layout
        setContent(body);



    }
}
