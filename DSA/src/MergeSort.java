public class MergeSort {
    /**
     * @description: Merge Sort Algorithm
     * @dev: Solve this
     */
    public static void mergeSortSample(int[] arr, int left, int right) {
        //

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortSample(arr, left, mid);
            mergeSortSample(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
        // return arr;
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        // System.out.println("n1" + n1);
        int n2 = r - mid;
        // System.out.println("n2" + n2);
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[l + x];

        }
        for (int y = 0; y < n2; y++) {
            rArr[y] = arr[mid + 1 + y];

        }
        int i = 0;
        int j = 0;
        int k = l;
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