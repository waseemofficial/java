import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void test1() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 8;
        int result = binarySearch.binarySearchSample(arr, target);
        assertEquals(7, result);
    }

    @Test
    public void test2() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 11;
        int result = binarySearch.binarySearchSample(arr, target);
        assertEquals(-1, result);
    }

    @Test
    public void test3() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 3;
        int result = binarySearch.binarySearchSample(arr, target);
        assertEquals(2, result);
    }

    @Test
    public void test4() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 5;
        int result = binarySearch.binarySearchSample(arr, target);
        assertEquals(4, result);
    }
}
