public class SelectionSort {
    /**
     * @description: Selection Sort Algorithm
     */
    public int[] selectionSortSamle(int[] arr) {
        int temp = 0;
        int size = arr.length;
        int min = -1;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
