package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

public class ContactFormComponent extends VerticalLayout {

    public ContactFormComponent() {
        addClassName("section"); // Usa el estilo moderno `.section` ya definido
        setSpacing(true);
        setPadding(true);

        H2 title = new H2("Formulario");
        Paragraph instructions = new Paragraph("Complete los campos a continuación para que podamos ponernos en contacto con usted.");

        TextField name = new TextField("Nombre");
        name.setRequired(true);

        EmailField email = new EmailField("Correo electrónico");
        email.setRequiredIndicatorVisible(true);
        email.setErrorMessage("Ingrese un correo válido.");

        TextField phone = new TextField("Teléfono");

        TextArea message = new TextArea("Mensaje");
        message.setPlaceholder("Escriba su consulta...");
        message.setHeight("100px");

        Checkbox captcha = new Checkbox("No soy robot");

        Button submitButton = new Button("Enviar", event -> {
            if (!captcha.getValue()) {
                Notification.show("Por favor confirme que no es un robot.");
            } else {
                Notification.show("Mensaje enviado. ¡Gracias!");
                // Aquí podrías agregar lógica para enviar el mensaje
            }
        });
        submitButton.addClickShortcut(Key.ENTER);
        submitButton.addClassName("cta-button");

        FormLayout form = new FormLayout();
        form.add(name, email, phone, message);
        form.setResponsiveSteps(
                new FormLayout.ResponsiveStep("0", 1),
                new FormLayout.ResponsiveStep("600px", 2)
        );
        form.setColspan(message, 2);

        title.getStyle().set("color", "white");
        name.getStyle()
                .set("background-color", "#121826")
                .set("color", "white")
                .set("border", "1px solid #4F46E5");

        email.getStyle().set("background-color", "#121826").set("color", "white");
        phone.getStyle().set("background-color", "#121826").set("color", "white");
        message.getStyle().set("background-color", "#121826").set("color", "white");


        add(title, instructions, form, captcha, submitButton);
    }
}
