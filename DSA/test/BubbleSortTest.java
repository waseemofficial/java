import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void test1() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = { 6, 5, 2, 8, 9, 4 };
        int result[] = bubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[] { 2, 4, 5, 6, 8, 9 }, result);

    }

    @Test
    public void test2() {

        BubbleSort bubbleSort = new BubbleSort();
        // sorting with Duplicates
        int[] arr = { 6, 5, 2, 8, 9, 4, 1, 10, 15, 17, 9 };
        int result[] = bubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[] { 1, 2, 4, 5, 6, 8, 9, 9, 10, 15, 17 }, result);

    }

    @Test
    public void test3() {

        BubbleSort bubbleSort = new BubbleSort();
        // sorting with Duplicates
        int[] arr = { 6, 5, 2, 8, 9, 4, 1, 10, 15, 17, 9, 10, 28, 50, 100, 100 };
        int result[] = bubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[] { 1, 2, 4, 5, 6, 8, 9, 9, 10, 10, 15, 17, 28, 50, 100, 100 }, result);

    }
}
