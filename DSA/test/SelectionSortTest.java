import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SelectionSortTest {
    @Test
    public void test1() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = { 6, 5, 2, 8, 9, 4 };
        int[] result = selectionSort.selectionSortSamle(arr);
        int[] expected = { 2, 4, 5, 6, 8, 9 };
        // for (int i : result) {
        // System.err.println(i);
        // }
        assertArrayEquals(expected, result);

    }
}
