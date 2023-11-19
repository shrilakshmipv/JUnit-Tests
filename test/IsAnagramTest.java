import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsAnagramTest {

    @Test
    public void testIsAnagramEmptyStrings() {
        IsAnagramS isAna = new IsAnagramS();
        String s = "";
        String t = "";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            isAna.isAnagram(s, t);
        });
        assertEquals("Both input strings are empty", exception.getMessage());
    }

    @Test
    public void testIsAnagramStrings(){
        IsAnagramS isAna = new IsAnagramS();
        String s = "anagram";
        String t = "nagaram";
        assertTrue(isAna.isAnagram(s, t));
    }

    @Test
    public void testIsAnagramNonAnagramStrings(){
        IsAnagramS isAna = new IsAnagramS();
        String s = "apples";
        String t = "orange";
        assertFalse(isAna.isAnagram(s, t));
    }

    @Test
    public void testIsAnagramDifferentLenghts(){
        IsAnagramS isAna = new IsAnagramS();
        String s = "apples";
        String t = "oranges";
        assertFalse(isAna.isAnagram(s, t));

    }

   @Test
    public void testIsAnagramDifferentCaseStrings(){
        IsAnagramS isAna = new IsAnagramS();
        String s = "Anagram";
        String t = "nagaram";
        assertTrue(isAna.isAnagram(s, t));
    }
 
}
