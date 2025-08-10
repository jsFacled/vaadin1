package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class CommunitySection extends VerticalLayout {
    public CommunitySection() {
        setId(SectionId.COMMUNITY.get());
        addClassNames("community");
        add(new H2("Community"));
        add(new Paragraph("Join the Spanish-speaking community of Java Machine Learning."));
        add(new Paragraph("Participate in forums, blog, and collaborative activities."));
    }
}
