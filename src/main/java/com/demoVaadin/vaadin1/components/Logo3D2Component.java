package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;

@Tag("div")
@JsModule("https://cdnjs.cloudflare.com/ajax/libs/three.js/r128/three.min.js")
@JsModule("./js/nw-logo-3d-2.js")
@CssImport("themes/my-theme/nw-logo.css")
public class Logo3D2Component extends Composite<Div> {

    public Logo3D2Component() {
        Div container = getContent();
        container.setId("nw-logo-3d-2");
        container.addClassName("nw-logo-container");
        container.setWidth("300px");
        container.setHeight("180px");

        Span info = new Span("NETICWARE 3D-2");
        info.addClassName("logo-info");
        container.add(info);

        container.getElement().executeJs(
                "window.addEventListener('load', () => {" +
                        "  if (window.THREE && window.initNWLogo2) {" +
                        "    window.initNWLogo2('nw-logo-3d-2');" +
                        "  } else {" +
                        "    setTimeout(() => window.initNWLogo2('nw-logo-3d-2'), 500);" +
                        "  }" +
                        "});"
        );
    }
}
