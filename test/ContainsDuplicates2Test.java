import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicates2Test {

    @Test
    public void testContainsDuplicatesWithNoDuplicates() {
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] numsList = {1, 2, 3, 4, 5, 6};
        assertFalse(containsDuplicates2.containsDuplicates(numsList));
    }

    @Test
    public void testContainsDuplicatesWithNull() {
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] nums = null;
        assertFalse(containsDuplicates2.containsDuplicates(nums));
    }

    @Test
    public void testContainsDuplicatesWithDuplicates() {
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] numsList = {1, 2, 3, 4, 5, 1};
        assertTrue(containsDuplicates2.containsDuplicates(numsList));
    }

    @Test
    public void testContainsDuplicatesWithEmptyArray(){
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] numsList = {}; 
        assertFalse(containsDuplicates2.containsDuplicates(numsList));
    }

    @Test
    public void testContainsDuplicatesWthSingleElement(){
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] nums_list={2};
        assertFalse(containsDuplicates2.containsDuplicates(nums_list));

    }

    @Test
    public void testContainsDuplicatesWithMultipleDuplicates(){
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] nums_list={1,2,3,4,3,2,5};
        assertTrue(containsDuplicates2.containsDuplicates(nums_list));

    }
    
    // add more tests
}
