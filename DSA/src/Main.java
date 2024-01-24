public class Main {
    public static void main(String[] args) {
        // QuickSort quickSort = new QuickSort();
        int[] arr = { 5, 6, 2, 3, 1, 8, 4, 7, 9, 11 };
        // quickSort.quickSortSample(arr, 0, arr.length - 1);
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSortSample(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
