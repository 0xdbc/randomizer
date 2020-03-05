package com.mc.randomizer.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component

public class RandomStringServiceImpl implements RandomStringService {

    @Override
    public String getRandomString(Integer size) {
        String ALPHANUM123 = "ABCDEFGHIJMNOPQRSTUVWXYZ123456790";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        while (sb.length() < size) {
            int index = (int) (new Random().nextFloat() * ALPHANUM123.length());
            sb.append(ALPHANUM123.charAt(index));
        }
        String s = sb.toString();
        return s;
    }
}
