package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;

public class AboutUsSection extends VerticalLayout {
    public AboutUsSection() {
        setId(SectionId.ABOUT.get());
        addClassNames("about", "section");
        add(new H2("About Us"));
        add(new Paragraph("Neticware is a software development startup focused on Java, Vaadin, and Machine Learning."));
        add(new Paragraph("We aim to create innovative tech solutions and a Spanish-speaking tech community."));
    }
}
