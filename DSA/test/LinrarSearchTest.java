
//import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
//import org.junit.jupiter.api.Assertions.*;

public class LinrarSearchTest {
    @Test
    public void test1() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        int result = linearSearch.linearSearchSample(arr, target);
        assertEquals(5, result);

    }

    @Test
    public void test2() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 11;
        int result = linearSearch.linearSearchSample(arr, target);
        assertEquals(-1, result);

    }
}
