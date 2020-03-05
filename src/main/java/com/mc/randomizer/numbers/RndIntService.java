package com.mc.randomizer.numbers;

import com.mc.randomizer.common.RandomTypesGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public final class RndIntService {

    @Autowired
    private RandomTypesGenerator rndGenerator;

    public String getRandomIntAsString(RndIntRequest rndIntRequest) {
        return Optional.of(rndIntRequest)
                .map(request -> rndGenerator.randomLong(request.getMinRange(), request.getMaxRange()))
                .map(String::valueOf)
                .orElseThrow(IllegalStateException::new);
    }
}
