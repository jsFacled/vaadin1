package com.demoVaadin.vaadin1.Layouts;

import com.demoVaadin.vaadin1.sections.Header;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.router.PageTitle;


// MainLayout.java
@PageTitle("Neticware")
public class MainLayout extends AppLayout {
    public MainLayout() {
        addToNavbar(new Header());
    }
}
