import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RecursiveBSTest {
    @Test
    public void test3() {
        RecursiveBinarySearch rbinarySearch = new RecursiveBinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 9;
        int result = rbinarySearch.rBinarySearchSample(arr, target, 0, arr.length - 1);
        assertEquals(8, result);
    }
}
