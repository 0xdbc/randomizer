package com.mc.randomizer.numbers;

import com.mc.randomizer.common.RandomTypesGenerator;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static java.lang.String.valueOf;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RndIntServiceTest {

    private static final Long MOCK_GEN_EXPECTED = 42L;

    @MockBean
    private RandomTypesGenerator randomTypesGenerator;

    @Autowired
    private RndIntService rndIntService;

    @BeforeEach
    public void init() {
        when(randomTypesGenerator.randomLong(anyLong(), anyLong())).thenReturn(MOCK_GEN_EXPECTED);
    }

    @Test
    public void rndServiceTest() {
        val expected = valueOf(MOCK_GEN_EXPECTED);
        val response = rndIntService.getRandomIntAsString(new RndIntRequest(23L, 42L));
        assert response.equals(expected) : "Response [" + response + "] is not as expected [" + MOCK_GEN_EXPECTED + "]";
    }
}
