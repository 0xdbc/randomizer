package com.mc.randomizer.common;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomTypesGenerator {

    private final static Random RND = new Random();

    public long randomLong(long minInclusive, long maxInclusive) {
        return RND.longs(minInclusive, (maxInclusive + 1))
                .limit(1)
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
