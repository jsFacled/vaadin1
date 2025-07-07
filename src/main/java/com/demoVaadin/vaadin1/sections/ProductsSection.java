package com.demoVaadin.vaadin1.sections;

import com.demoVaadin.vaadin1.utils.SectionId;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ProductsSection extends VerticalLayout {
    public ProductsSection() {
        setId(SectionId.PRODUCTS.get());

        add(new H2("Prototypes and Current Products"));
        add(new Paragraph("• Online dataset analyzer (Pandas-style SaaS)."));
        add(new Paragraph("• Initial ecommerce platform (clothing)."));
        add(new Paragraph("• Technical forums (Java + ML)."));
        add(new Paragraph("• Professional websites."));
    }
}
