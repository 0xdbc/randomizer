package com.mc.randomizer.numbers;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public final class RndIntRequest {

    @NotNull(message = "Min range (inclusive) is missing")
    private final Long minRange;

    @NotNull(message = "Max range (inclusive) is missing")
    private final Long maxRange;
}
