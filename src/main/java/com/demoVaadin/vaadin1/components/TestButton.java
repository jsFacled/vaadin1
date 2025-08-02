package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;

public class TestButton extends Button {

    public TestButton() {
        super("Ir a /pru");
        addClassName("test-button");


        addClassName("test-button");

        addClickListener(e -> UI.getCurrent().getPage().setLocation("pru"));

    }
}
