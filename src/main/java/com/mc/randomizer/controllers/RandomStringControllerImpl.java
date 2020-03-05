package com.mc.randomizer.controllers;

import com.mc.randomizer.services.RandomStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomStringControllerImpl implements RandomStringController {

    @Autowired
    private RandomStringService rss;

    @GetMapping("/strings")
    @Override
    public String generateRandomStr(@RequestParam Integer size) {
        return rss.getRandomString(size);
    }
}
