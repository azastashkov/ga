package ch2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {
    @Test
    public void testSelectionSort() {
        SelectionSort selectionSort = new SelectionSort();

        int[] array1 = { 4, 1, 2, 5, 9};
        selectionSort.sort(array1);
        assertArrayEquals(new int[] {1, 2, 4, 5, 9}, array1);

        int[] array2 = { 12, 7, 3, 0, 4};
        selectionSort.sort(array2);
        assertArrayEquals(new int[] {0, 3, 4, 7, 12}, array2);
    }
}
