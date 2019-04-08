package com.example.excercise10creditcards;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("creditcardissuer")
@Getter
@Setter
public class CardLoader {

List<CreditCardIssuer> creditCardIssuer(){}

}
