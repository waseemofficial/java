public class RecursiveBinarySearch {
    /**
     * @description:Recursive Binary Search Algorithm
     */
    public int rBinarySearchSample(int[] arr, int target, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return rBinarySearchSample(arr, target, mid + 1, right);
            } else {
                return rBinarySearchSample(arr, target, left, mid - 1);
            }
        }
        return -1;
    }
}
