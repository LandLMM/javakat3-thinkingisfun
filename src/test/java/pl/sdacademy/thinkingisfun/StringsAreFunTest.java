package pl.sdacademy.thinkingisfun;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringsAreFunTest {

    private StringsAreFun fun;

    @Before
    public void init() {
        fun = new StringsAreFun();
    }

    @Test
    public void shouldRecognizeOddPalindrome() {
        String notSureIfPalindrome = "kajak";

        boolean isPalindrome = fun.isPalindrome(notSureIfPalindrome);

        assertTrue(isPalindrome);
    }

    @Test
    public void shouldRecognizeEvenPalindrome() {
        String notSureIfPalindrome = "atumammamuta"; //a tu mam mamuta

        boolean isPalindrome = fun.isPalindrome(notSureIfPalindrome);

        assertTrue(isPalindrome);
    }

    @Test
    public void shouldRecognizeWhenNotPalindrome() {
        String notSureIfPalindrome = "macarena";

        boolean isPalindrome = fun.isPalindrome(notSureIfPalindrome);

        assertFalse(isPalindrome);
    }

    @Test
    public void shouldCountSingleOccurrence() {
        String baseTextThatWillBeAnalyzed = "gjqibrlaaaawvqog";
        String textThatWillBeCounted = "aaaa";

        Integer countedOccurrences = fun.countOccurences(baseTextThatWillBeAnalyzed, textThatWillBeCounted);

        assertEquals((Integer) 1, countedOccurrences);
    }

    @Test
    public void shouldCountMultipleOccurrence() {
        String baseTextThatWillBeAnalyzed = "nqbuBBlvmqhBBpafqBB";
        String textThatWillBeCounted = "BB";

        Integer countedOccurrences = fun.countOccurences(baseTextThatWillBeAnalyzed, textThatWillBeCounted);

        assertEquals((Integer) 3, countedOccurrences);
    }

    @Test
    public void shouldCountNoOccurrence() {
        String baseTextThatWillBeAnalyzed = "sdafbwsabdas";
        String textThatWillBeCounted = "ABC";

        Integer countedOccurrences = fun.countOccurences(baseTextThatWillBeAnalyzed, textThatWillBeCounted);

        assertEquals((Integer) 0, countedOccurrences);
    }

    @Test
    public void shouldCountContinueOccurrence() {
        String baseTextThatWillBeAnalyzed = "sdafABCABCABCABCbwsabdas";
        String textThatWillBeCounted = "ABC";

        Integer countedOccurrences = fun.countOccurences(baseTextThatWillBeAnalyzed, textThatWillBeCounted);

        assertEquals((Integer) 4, countedOccurrences);
    }

    @Test
    public void shouldCodeRot13() {
        String textToBeCoded = "Java is so Funny";
        String expectedCodedText = "Wnin vf fb Shaal";

        String codedText = fun.rot13(textToBeCoded);

        assertEquals(expectedCodedText, codedText);
    }

    @Test
    public void shouldCodeRot13Funny() {
        String textToBeCoded = "hejnal urwany";
        String expectedCodedText = "urwany hejnal";

        String codedText = fun.rot13(textToBeCoded);

        assertEquals(expectedCodedText, codedText);
    }

}
