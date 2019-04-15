package com.example.morseencoder.view.controller;

import com.example.morseencoder.view.communication.EncoderClient;
import com.example.morseencoder.view.messages.ValidatedMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ValidatedFormMessageController {

  private ValidatedMessage validatedMessage = new ValidatedMessage();
  private final EncoderClient encoderClient;
  @ModelAttribute("validatedMessage")
  ValidatedMessage validatedMessage() {
    return validatedMessage;
  }

  @GetMapping
  String page() {
    return "messages/validated-form-message";
  }

  @PostMapping
  String post(@Valid ValidatedMessage validatedMessage, BindingResult result)  {
    if (result.hasErrors()) {
      return page();
    }

    String encodedMessage = encoderClient.send(validatedMessage.getText());
    validatedMessage.setText(encodedMessage);

    return "redirect:/";
  }

  @PostMapping
  @ModelAttribute("plaintext")
  String addFlashAttribute(@Valid RedirectAttributesModelMap redirectedattributes) {
    return page();
  }

}
