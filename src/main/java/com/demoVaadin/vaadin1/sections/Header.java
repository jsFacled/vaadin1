package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.components.Logo2DComponent;
import com.demoVaadin.vaadin1.components.NavbarComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class Header extends HorizontalLayout {

    public Header() {
        addClassName("main-header");
        setWidthFull();
        setAlignItems(Alignment.CENTER);
        setSpacing(true);
        setPadding(true);

        Logo2DComponent logo = new Logo2DComponent();
        NavbarComponent navbar = new NavbarComponent();

        add(logo, navbar);

        setFlexGrow(0, logo);
        setFlexGrow(1, navbar);
    }
}