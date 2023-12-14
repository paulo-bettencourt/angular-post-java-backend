package org.angularpost.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    String[] news = {
            "first", "second"
    };

    @GetMapping("/news")
    public String[] getNews() {
        return news;
    }
}
