import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class AddTwoSumTest {

    @Test
    public void testTwoSum() {
        AddTwoSum s = new AddTwoSum();
        int[] num = {2,5,7,9};
        int tar = 7;
        int total = 0;
        int[] res = s.twoSum(num, tar);
        //another way to write junit test
        /*int[] expected = {0, 1};
        int[] result = calculator.twoSum(nums, target);
        assertArrayEquals(expected, result); */
        for(int i=0 ; i<res.length;i++){
             total += num[i];
        }
        assertEquals(tar, total);        
    }
    

    @Test
    public void testTwoSumWithNoSum() {
        AddTwoSum s = new AddTwoSum();
        int[] num = {2,1,7,9};
        int tar = 7;
        int total = 0;
        int[] res = s.twoSum(num, tar);
        for(int i=0 ; i<res.length;i++){
             total += num[i];
        }
        assertNotEquals(tar, total);
    }

    @Test
    public void testTwoSumWithEmptyArray() {
        AddTwoSum s = new AddTwoSum();
        int[] num = {};
        int tar = 7;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> {
            s.twoSum(num, tar);
        });
        
        assertEquals("Array is empty", exception.getMessage());
    }

   
}
