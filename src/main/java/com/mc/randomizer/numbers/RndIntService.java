package com.mc.randomizer.numbers;

import com.mc.randomizer.common.RandomTypesGenerator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public final class RndIntService {

    private final RandomTypesGenerator rndGenerator;

    public String getRandomIntAsString(RndIntRequest rndIntRequest) {
        return Optional.of(rndIntRequest)
                .map(request -> rndGenerator.randomLong(request.getMinRange(), request.getMaxRange()))
                .map(String::valueOf)
                .orElseThrow(IllegalStateException::new);
    }
}
