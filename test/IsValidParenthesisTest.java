import org.junit.Test;
import static org.junit.Assert.*;

public class IsValidParenthesisTest {

    @Test
    public void testValidParentheses() {
        IsValidParenthesis isValidParenthesis = new IsValidParenthesis();
        assertTrue(isValidParenthesis.isValid("()"));
        assertTrue(isValidParenthesis.isValid("()[]{}"));
        assertTrue(isValidParenthesis.isValid("{[()]}"));
    }

    @Test
    public void testInvalidParentheses() {
        IsValidParenthesis isValidParenthesis = new IsValidParenthesis();
        assertFalse(isValidParenthesis.isValid("(]"));
        assertFalse(isValidParenthesis.isValid("([)]"));
        assertFalse(isValidParenthesis.isValid("{{}"));
    }

    @Test
    public void testEmptyString() {
        IsValidParenthesis isValidParenthesis = new IsValidParenthesis();
        assertTrue(isValidParenthesis.isValid(""));
    }

    @Test
    public void testOnlyOpenParentheses() {
        IsValidParenthesis isValidParenthesis = new IsValidParenthesis();
        assertFalse(isValidParenthesis.isValid("({{("));
    }

    @Test
    public void testOnlyClosedParentheses() {
        IsValidParenthesis isValidParenthesis = new IsValidParenthesis();
        assertFalse(isValidParenthesis.isValid(")}])"));
    }
}
