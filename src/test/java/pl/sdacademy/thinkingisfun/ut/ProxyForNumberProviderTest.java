package pl.sdacademy.thinkingisfun.ut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProxyForNumberProviderTest {

    @Mock
    private NumberProvider numberProvider;

    @Test
    public void getIntegerTest() {
        // given
        Integer valueThatNumberProviderWillReturn = 123;
        when(numberProvider.provideInteger()).thenReturn(valueThatNumberProviderWillReturn);
        // when
        ProxyForNumberProvider proxy = new ProxyForNumberProvider(numberProvider);
        Integer receivedInteger = proxy.getInteger();
        // then
        assertEquals(valueThatNumberProviderWillReturn, receivedInteger);
    }
}