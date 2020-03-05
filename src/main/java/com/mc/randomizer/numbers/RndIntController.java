package com.mc.randomizer.numbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class RndIntController {

    @Autowired
    private RndIntService rndIntsService;

    @PostMapping("/random/ints")
    public String randomInt(@RequestBody RndIntRequest request) {
        return rndIntsService.getRandomIntAsString(request);
    }
}
