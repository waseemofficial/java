import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {
    @Test
    public void test1() {
        int[] arr = { 5, 6, 2, 3, 1, 8, 4, 1, 7, 9, 0 };

        // MergeSort2 mergeSort = new MergeSort2();
        MergeSort2.mergeSortSample(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, arr);
    }

    @Test
    public void test2() {
        int[] arr = { 5, 6, 51, 100, 2, 3, 1, 8, 100, 4, 1, 7, 9, 21, 0, 61 };

        // MergeSort2 mergeSort = new MergeSort2();
        MergeSort2.mergeSortSample(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 51, 61, 100, 100 }, arr);
    }
}
