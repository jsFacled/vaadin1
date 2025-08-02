package com.demoVaadin.vaadin1.components;


import com.demoVaadin.vaadin1.Layouts.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.dom.Element;

@Route(value = "logo3d", layout = MainLayout.class)
@JsModule("https://unpkg.com/@google/model-viewer/dist/model-viewer.min.js")
public class Logo3DView extends VerticalLayout {

    public Logo3DView() {
        Element modelViewer = new Element("model-viewer");
        modelViewer.setAttribute("src", "images/logo_simple.glb");
        modelViewer.setAttribute("camera-controls", true);
        modelViewer.setAttribute("auto-rotate", true);
        modelViewer.setAttribute("style", "width: 600px; height: 450px;");

        getElement().appendChild(modelViewer);
    }
}
