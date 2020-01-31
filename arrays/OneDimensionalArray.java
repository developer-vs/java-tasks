package arrays;

public class OneDimensionalArray {
    // Create an empty Array
    // Time complexity: O(1)
    private int[] arr = null;

    public OneDimensionalArray(int sizeOfArray) {
        // Space complexity O(n)
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Insert a value in an array
    // Time complexity: O(1)
    // Space complexity O(1)
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted " + valueToBeInserted +
                        " at location " + location);
            } else {
                System.out.println("This cell is already used by another value.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access an array!");
        }
    }

    // Traverse and print a given array
    // Time complexity: O(n)
    // Space complexity O(1)
    public void traverseArray() {
        try {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array no longer exist!");
        }
    }

    // Access a particular element(cell#) of an array
    // Time complexity: O(1)
    // Space complexity O(1)
    public void accessingCell(int cellNumber) {
        try {
            System.out.println(arr[cellNumber]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access an array!");
        }
    }

    // Search for an element in the given array
    // Time complexity: O(n)
    // Space complexity O(1)
    public void searchInAnArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value found!");
                System.out.println("Index of " + valueToSearch + " is: " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found!");
    }

    // Delete a given cell's value
    // Time complexity: O(1)
    // Space complexity O(1)
    public void deleteValueFromArray(int deleteValueFromThisCell) {
        try {
            arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't delete this value as cell #" +
                    deleteValueFromThisCell + " is not in the range of array!");
        }
    }
}