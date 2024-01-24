import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void test1() {
        int[] arr = { 5, 6, 2, 3, 1, 8, 4 };
        QuickSort quickSort = new QuickSort();
        quickSort.quickSortSample(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 8 }, arr);
    }

    @Test
    public void test2() {
        int[] arr = { 51, 6, 27, 3, 11, 8, 44 };
        QuickSort quickSort = new QuickSort();
        quickSort.quickSortSample(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 3, 6, 8, 11, 27, 44, 51 }, arr);
    }

    @Test
    public void test3() {
        int[] arr = { 5, 6, 2, 3, 1, 8, 4, 5, 7, 8 };
        QuickSort quickSort = new QuickSort();
        quickSort.quickSortSample(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 5, 6, 7, 8, 8 }, arr);
    }
}
