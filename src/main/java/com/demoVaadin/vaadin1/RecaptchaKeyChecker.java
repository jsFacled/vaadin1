package com.demoVaadin.vaadin1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RecaptchaKeyChecker implements CommandLineRunner {

    @Value("${recaptcha.site-key}")
    private String siteKey;

    @Override
    public void run(String... args) {
        System.out.println("🔍 reCAPTCHA SITE KEY detectada: " + siteKey);
    }
}
