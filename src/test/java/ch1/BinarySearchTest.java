package ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        int[] array = { 1, 3, 5, 7, 9};
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(1, binarySearch.binarySearch(array, 3));
        assertEquals(4, binarySearch.binarySearch(array, 9));
        assertEquals(-1, binarySearch.binarySearch(array, 4));
        assertEquals(-1, binarySearch.binarySearch(array, 0));
        assertEquals(-1, binarySearch.binarySearch(array, 10));
    }
}
