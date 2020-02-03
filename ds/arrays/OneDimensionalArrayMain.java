package ds.arrays;

import ds.arrays.OneDimensionalArray;

public class OneDimensionalArrayMain {

    public static void main(String[] args) {
        System.out.println("Creating a blank array of size 10...");
        OneDimensionalArray oda = new OneDimensionalArray(10);

        System.out.println("\nPrinting the array...");
        oda.traverseArray();

        System.out.println("\nInserting few values in the array...");
        oda.insert(0,0);
        oda.insert(1,10);
        oda.insert(2,20);
        oda.insert(3,30);
        oda.insert(4,40);
        oda.insert(5,50);
        oda.insert(6,60);
        oda.insert(7,70);
        oda.insert(8,80);
        oda.insert(1,100);
        oda.insert(12,120);

        oda.traverseArray();

        System.out.println("\nAccessing cell number #1 in the array...");
        oda.accessingCell(1);

        System.out.println("\nSearching 30 in the array...");
        oda.searchInAnArray(30);

        System.out.println("\nSearching 400 in the array...");
        oda.searchInAnArray(400);

        System.out.println("\nDeleting value from cell #3 of the array...");
        System.out.println("Before deleting:");
        oda.traverseArray();
        oda.deleteValueFromArray(3);
        System.out.println("After deleting:");
        oda.traverseArray();


    }
}