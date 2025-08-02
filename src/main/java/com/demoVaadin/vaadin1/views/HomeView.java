package com.demoVaadin.vaadin1.views;


import com.demoVaadin.vaadin1.Layouts.MainLayout;
import com.demoVaadin.vaadin1.sections.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Neticware - Home")
public class HomeView extends VerticalLayout {
    public HomeView() {
        setPadding(false);
        setSpacing(false);
        setMargin(false);

        add(
                new HeroSection(),
                new ServicesSection(),
                new ProductsSection(),
                new AboutUsSection(),
                new CommunitySection(),
                new ContactSection(),
                new Footer()
        );
    }
}
