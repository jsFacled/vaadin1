package com.demoVaadin.vaadin1;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Inline;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.AppShellSettings;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.Push;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Marca esta clase como la app principal de Spring Boot
@Theme("nw-base") // Aplica el tema definido en tu proyecto
@PWA(name = "Neticware Landing Page", shortName = "Neticware") // Configura la Progressive Web App
@Push // Habilita actualizaciones en tiempo real (WebSockets o Long Polling)
public class Vaadin1Application implements AppShellConfigurator {

    public static void main(String[] args) {
        // 🔹 Arranca la aplicación Spring Boot con Vaadin
        SpringApplication.run(Vaadin1Application.class, args);
    }

    /**
     * Este método se ejecuta antes de renderizar cualquier vista.
     * Sirve para inyectar scripts, metadatos o estilos globales
     * en todas las páginas de la app.
     */
    @Override
    public void configurePage(AppShellSettings settings) {
        settings.addInlineWithContents(
                Inline.Position.APPEND, // posición del script en el HTML
                "<script src='https://www.google.com/recaptcha/api.js' async defer></script>",
                Inline.Wrapping.NONE    // sin envolver el contenido
        );
    }



}

