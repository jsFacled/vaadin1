package com.demoVaadin.vaadin1.components;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ContactFormComponent extends VerticalLayout {

    @Value("${recaptcha.site-key}")
    private String recaptchaSiteKey;

    public ContactFormComponent() {
        addClassName("contact-card");
        setWidthFull();
        getStyle().set("maxWidth", "960px");
        setSpacing(true);
        setPadding(false);

        H2 title = new H2("Formulario");
        Paragraph instructions = new Paragraph(
                "Complete los campos a continuación para que podamos ponernos en contacto con usted."
        );

        TextField name = new TextField("Nombre");
        name.setRequiredIndicatorVisible(true);

        EmailField email = new EmailField("Correo electrónico");
        email.setRequiredIndicatorVisible(true);
        email.setErrorMessage("Ingrese un correo válido.");

        TextField phone = new TextField("Teléfono");

        TextArea message = new TextArea("Mensaje");
        message.setPlaceholder("Escriba su consulta...");
        message.setHeight("120px");

        Div captchaWrapper = new Div();
        captchaWrapper.setClassName("recaptcha-wrapper");
        captchaWrapper.getElement().setProperty("innerHTML",
                "<div class='g-recaptcha' data-sitekey='" + recaptchaSiteKey + "'></div>"
        );

        Button submitButton = new Button("Enviar", event -> {
            Notification.show("Validación pendiente de implementar en el backend");
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

        Div wrapper = new Div(title, instructions, form, captchaWrapper, submitButton);
        wrapper.addClassName("form-wrapper");

        add(wrapper);
    }
}
