import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {
    @Test
    public void test1() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = { 6, 5, 2, 8, 9, 4, 1, 3 };

        int[] result = insertionSort.insertionSortSample(arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 8, 9 }, result);
    }

    // Sorting with duplicate values
    @Test
    public void test2() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = { 6, 6, 5, 2, 8, 9, 4, 1, 3 };

        int[] result = insertionSort.insertionSortSample(arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 6, 8, 9 }, result);
    }

}
