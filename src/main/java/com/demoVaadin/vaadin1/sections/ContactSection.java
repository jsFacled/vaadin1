package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.components.ContactFormComponent;
import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContactSection extends VerticalLayout {
    public ContactSection() {
        setId(SectionId.CONTACT.get());   // ok

        setPadding(false);
        setSpacing(false);
        setWidthFull();                    // la sección ocupa el ancho
        setAlignItems(Alignment.CENTER);

        add(new ContactFormComponent());
    }
}