package com.mc.randomizer.numbers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public final class RndIntController {

    private final RndIntService rndIntsService;

    @PostMapping("/random/ints")
    public String randomInt(@RequestBody RndIntRequest request) {
        return rndIntsService.getRandomIntAsString(request);
    }
}
