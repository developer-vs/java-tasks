package algo.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 9, 2};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            // поскольку мы сравниваем arr[i] и arr[i + 1],
            // и чтобы мы не вышли за пределы массива, делаем на 1 цикл меньше.
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
