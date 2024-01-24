public class MergeSort {
    /**
     * @description: Merge Sort Algorithm
     * @dev: Solve this
     */
    public void mergeSortSample(int[] arr, int left, int right) {
        //

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortSample(arr, left, mid);
            mergeSortSample(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
        // return arr;
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[left + x];

        }
        for (int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];

        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;

        }
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = lArr[j];
            j++;
            k++;
        }
    }

}