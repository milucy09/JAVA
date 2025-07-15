import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]);
        assertArrayEquals(new int[]{0, 1}, result);
        

    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[] result = sol.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testTargetNotFound() {
        Solution sol = new Solution();
        int[] result = sol.twoSum(new int[]{2, 3, 6, 6}, 20);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}
