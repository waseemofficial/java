import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {
    @Test
    public void test1() {
        int[] arr = { 5, 6, 2, 3, 1, 8, 4 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSortSample(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 8 }, arr);
    }
}
