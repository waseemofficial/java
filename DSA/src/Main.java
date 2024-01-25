public class Main {
    public static void main(String[] args) {
        // QuickSort quickSort = new QuickSort();
        // int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };// { 5, 6, 2, 3, 1, 8, 4, 21, 7,
        // 9, 0 };// { 5, 6, 2, 3, 1, 8, 4 };
        // quickSort.quickSortSample(arr, 0, arr.length - 1);
        // MergeSort2 mergeSort = new MergeSort2();
        // MergeSort2.mergeSortSample(arr, 0, arr.length - 1);
        // MergeSort.mergeSortSample(arr, 0, arr.length - 1);
        // for (int i : arr) {
        // System.out.print(i);
        // }
        // LinkList linkList = new LinkList();
        // linkList.insert(18);
        // linkList.insert(19);
        // linkList.insert(20);
        // linkList.insertAtStart(0);
        // linkList.insertAt(-5, 10);
        // linkList.insertAt(5, 30);
        // linkList.show();
        // System.out.println("size : " + linkList.size());
        // linkList.deleteAt(3);
        // linkList.deleteAt(3);
        // linkList.show();
        // System.out.println("size : " + linkList.size());
        Stack stack = new Stack();
        stack.push(1);
        stack.push(10);
        stack.push(30);
        stack.show();
        System.out.println();

        System.out.println("peek : " + stack.peek());
        System.out.println("pop : " + stack.pop());
        System.out.println("peek : " + stack.peek());
        System.out.println("peek : " + stack.peek());
        stack.show();

    }
}
