package com.mc.randomizer.services;

import org.springframework.stereotype.Component;

@Component
public interface RandomStringService {

    String getRandomString(Integer size);
}
