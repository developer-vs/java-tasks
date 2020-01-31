package algo.reversearray;

import algo.bubblesort.BubbleSort;

public class ReverseArray extends BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 7, 4, 19, 1};

        System.out.print("Original array:\t");
        printOriginalArray(arr);

        bubbleSort(arr);
        System.out.print("\nSorted array:\t");
        printOriginalArray(arr);

        reverseArray(arr);
        System.out.print("\nReverse array:\t");
        printReverseArray(arr);
    }

    public static int[] reverseArray(int[] arr) {
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void printOriginalArray(int[] arr) {
        printReverseArray(arr);
    }

    public static void printReverseArray(int[] arr) {
        for(int number : arr) {
            System.out.print(number + " ");
        }
    }
}
