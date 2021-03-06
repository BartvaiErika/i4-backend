package exercise9cinemamessages.controller;

import exercise9cinemamessages.model.Customer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("list")
@Getter
@Setter
public class CustomerLoader {

    private List<Customer> customer;
}

