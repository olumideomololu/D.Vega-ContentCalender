package dev.oomololu.contentcalender.controller;

import dev.oomololu.contentcalender.config.ContentCalenderProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    private final ContentCalenderProperties properties;

    public testController(ContentCalenderProperties properties) {
        this.properties = properties;
    }
    @GetMapping("/")
    public ContentCalenderProperties test() {
        return properties;
    }
}
