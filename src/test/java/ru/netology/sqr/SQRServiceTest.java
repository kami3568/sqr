package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();


        int actual = service.calculate(500, 900);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
