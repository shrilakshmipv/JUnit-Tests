import org.junit.Test;
import static org.junit.Assert.*;

public class IsPalindromePhraseTest {

    @Test
    public void testEmptyString() {
        IsPalindromePhrase isPalindromePhrase = new IsPalindromePhrase();
        assertTrue(isPalindromePhrase.isPalindrome(""));
    }

    @Test
    public void testValidPalindrome() {
        IsPalindromePhrase isPalindromePhrase = new IsPalindromePhrase();
        assertTrue(isPalindromePhrase.isPalindrome("A man, a plan, a canal, Panama"));
    }

    @Test
    public void testNonPalindrome() {
        IsPalindromePhrase isPalindromePhrase = new IsPalindromePhrase();
        assertFalse(isPalindromePhrase.isPalindrome("Hello, World!"));
    }

    @Test
    public void testPalindromeWithPunctuation() {
        IsPalindromePhrase isPalindromePhrase = new IsPalindromePhrase();
        assertTrue(isPalindromePhrase.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testPalindromeWithNumbers() {
        IsPalindromePhrase isPalindromePhrase = new IsPalindromePhrase();
        assertTrue(isPalindromePhrase.isPalindrome("Able was I 12321 I saw elba"));
    }

    @Test
    public void testPalindromeWithWhitespace() {
        IsPalindromePhrase isPalindromePhrase = new IsPalindromePhrase();
        assertTrue(isPalindromePhrase.isPalindrome("A man a plan a canal Panama"));
    }
}
