package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.components.HamburgerMenuComponent;
import com.demoVaadin.vaadin1.components.Logo2DComponent;
import com.demoVaadin.vaadin1.components.NavbarComponent;
<<<<<<< HEAD
=======
import com.demoVaadin.vaadin1.components.HamburgerMenuComponent;
>>>>>>> pru
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Header extends HorizontalLayout {

    public Header() {
<<<<<<< HEAD
       addClassName("main-header");
=======
     addClassName("main-header");
>>>>>>> pru
        setWidthFull();
        setSpacing(false);
        setPadding(false);

        // Componentes principales
<<<<<<< HEAD
        Logo2DComponent logo = new Logo2DComponent();
=======
        Logo2DComponent logo = new Logo2DComponent("logo__icon--animated");
    
>>>>>>> pru
        NavbarComponent navbar = new NavbarComponent();
        HamburgerMenuComponent hamburgerMenu = new HamburgerMenuComponent();

        // Botón hamburguesa
        Button hamburger = new Button("☰");
        hamburger.addClassName("hamburger-button");
        hamburger.addClickListener(e -> hamburgerMenu.showMenu());

        // Top bar horizontal
        HorizontalLayout topBar = new HorizontalLayout(logo, navbar, hamburger);
        topBar.setWidthFull();
        topBar.setAlignItems(Alignment.CENTER);
        topBar.setJustifyContentMode(JustifyContentMode.BETWEEN);

        topBar.setFlexGrow(0, logo);
        topBar.setFlexGrow(1, navbar);
        topBar.setFlexGrow(0, hamburger);

        // Estructura general
        add(topBar, hamburgerMenu);
    }
}
