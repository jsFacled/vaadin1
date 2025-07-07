package com.demoVaadin.vaadin1.utils;

public enum SectionId {
    HERO("hero"),
    SERVICES("services"),
    PRODUCTS("products"),
    ABOUT("about"),
    COMMUNITY("community"),
    CONTACT("contact");

    private final String id;

    SectionId(String id) {
        this.id = id;
    }

    public String get() {
        return id;
    }
}
