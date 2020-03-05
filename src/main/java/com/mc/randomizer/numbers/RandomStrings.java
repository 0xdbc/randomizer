package com.mc.randomizer.numbers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Component
public final class RandomStrings {

    public String randomizeString(int size) {
        return new Random().toString();
    }
}
