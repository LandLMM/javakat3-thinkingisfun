package pl.sdacademy.thinkingisfun.ut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorForProviderTest {

    @Mock
    private NumberProvider numberProvider;

    @Test
    public void getInteger() {
        // given
        Integer providedInteger1 = 11;
        Integer providedInteger2 = 13;
        when(numberProvider.provideInteger()).thenReturn(providedInteger1, providedInteger2);
        // when
        CalculatorForProvider calculator = new CalculatorForProvider(numberProvider);
        Long calculatedSum = calculator.add();
        // then
        assertEquals((Long) 24L, calculatedSum);
    }

}