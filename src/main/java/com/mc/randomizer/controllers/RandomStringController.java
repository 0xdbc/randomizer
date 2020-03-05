package com.mc.randomizer.controllers;

import org.springframework.stereotype.Controller;

@Controller
public interface RandomStringController {

    String generateRandomStr(Integer size);
}
