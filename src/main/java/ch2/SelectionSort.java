package ch2;

public class SelectionSort {
    public void sort(int[] array) {
        if (array.length < 1) {
            return;
        }

        for (int swapIndex = 0; swapIndex < array.length; swapIndex++) {
            int minElementIndex = findMinElementIndex(array, swapIndex);
            if (array[minElementIndex] < array[swapIndex]) {
                int swap = array[swapIndex];
                array[swapIndex] = array[minElementIndex];
                array[minElementIndex] = swap;
            }
        }
    }

    int findMinElementIndex(int[] array, int startIndex) {
        int minElement = array[startIndex];
        int minElementIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }
}
