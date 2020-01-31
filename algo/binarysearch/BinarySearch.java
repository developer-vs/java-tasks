package algo.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {-2, -5, 8, 9, 10, 50}, 10));
        System.out.println(binarySearch(new int[] {-5, -2, 8, 9, 10, 50, 60}, 60));
        System.out.println(binarySearch(new int[] {8}, 8));
        System.out.println(binarySearch(new int[] {-2, 8, 23}, 8));
        System.out.println(binarySearch(new int[] {-9, 50, 90}, 55));
        System.out.println(binarySearch(new int[] {}, 3));
        System.out.println(binarySearch(new int[] {}, -1));
        System.out.println(binarySearch(new int[] {}, 0));
    }

    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if(value == input[midpoint]) {
                return midpoint;
            } else if (value > input[midpoint]) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }
}
