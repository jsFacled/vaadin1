package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;

public class PruebaComponente extends Div {

    public PruebaComponente() {
        setHeight("100px");
        setWidthFull();
        getStyle().set("background-color", "green");

        Span test = new Span("✅ COMPONENTE FUNCIONA");
        test.getStyle().set("color", "white");
        add(test); // ⚠️ ESTO ES CLAVE: agrega contenido visible
    }
}
