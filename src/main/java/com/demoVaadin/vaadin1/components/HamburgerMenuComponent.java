package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;

public class HamburgerMenuComponent extends Div {

    public HamburgerMenuComponent() {
        addClassName("hamburger-menu");

        Button closeBtn = new Button("✖");
        closeBtn.addClassName("close-button");
        closeBtn.addClickListener(e -> hideMenu());

        add(
                closeBtn,
                createLink("/#services", "Servicios"),
                createLink("/#products", "Productos"),
                createLink("/#community", "Comunidad"),
                createLink("/#contact", "Contacto"),
                createLink("/#about", "Nosotros")
        );
    }

    private Anchor createLink(String href, String text) {
        Anchor link = new Anchor(href, text);
            link.getElement().addEventListener("click",e -> {
            hideMenu();
            UI.getCurrent().getPage().executeJs("document.querySelector('" + href.replace("/#", "#") + "').scrollIntoView({behavior: 'smooth'});");
        });
        return link;
    }

    public void showMenu() {
        System.out.println("[********* debug **********] : mostrando menú");
        getElement().getClassList().add("show");
    }

    public void hideMenu() {
        System.out.println("[********* debug **********] : ocultando menú");
        getElement().getClassList().remove("show");
    }
}
