package exercise9cinemamessages.controller;

import exercise9cinemamessages.model.Customer;
import exercise9cinemamessages.model.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TemplateEngine {

    private final TemplateLoader templateLoader;

    public void getMessage(List<Customer> customers) {
        List<Template> templates = templateLoader.getTemplate();
        customers.stream()
                .forEach(customer -> {
                    if (customer.getName().contains("Threepwood")) {
                        System.out.println(templates.get(2).getGreeting() + " " +
                                customer.getName() + ", " + templates.get(2).getText());
                    } else if (customer.getName().startsWith("Ms.")
                            || customer.getName().startsWith("Mrs.")) {
                        System.out.println(templates.get(1).getGreeting() + " " +
                                customer.getName() + ", " + templates.get(1).getText());
                    } else if (customer.getName().startsWith("Mr.")) {
                        System.out.println(templates.get(0).getGreeting() + " " +
                                customer.getName() + ", " + templates.get(0).getText());
                    } else System.out.println(templates.get(3).getGreeting() + " " +
                            customer.getName() + ", " + templates.get(3).getText());
                });
    }
}