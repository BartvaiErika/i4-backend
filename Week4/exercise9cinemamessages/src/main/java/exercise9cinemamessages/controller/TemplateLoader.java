package exercise9cinemamessages.controller;

import exercise9cinemamessages.model.Template;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("drafts")
@Getter
@Setter
public class TemplateLoader {

    private List<Template> template;
}