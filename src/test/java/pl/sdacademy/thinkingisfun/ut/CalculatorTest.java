package pl.sdacademy.thinkingisfun.ut;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTest1() {
        // given
        int a = 5;
        int b = 9;
        // when
        Calculator calculator = new Calculator();
        long result = calculator.add(a, b);
        // then
        assertEquals(14, result);
    }
}