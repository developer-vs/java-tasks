package one_dimensional_array;

public class SingleDimensionArrayMain {

    public static void main(String[] args) {
        System.out.println("Creating a blank array of size 10...");
        SingleDimensionArray sda = new SingleDimensionArray(10);

        System.out.println("\nPrinting the array...");
        sda.traverseArray();

        System.out.println("\nInserting few values in the array...");
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(3,30);
        sda.insert(4,40);
        sda.insert(5,50);
        sda.insert(6,60);
        sda.insert(7,70);
        sda.insert(8,80);
        sda.insert(1,100);
        sda.insert(12,120);

        System.out.println("\nAccessing cell number #1 in the array...");
        sda.accessingCell(1);

        System.out.println("\nSearching 30 in the array...");
        sda.searchInAnArray(30);

        System.out.println("\nSearching 400 in the array...");
        sda.searchInAnArray(400);

        System.out.println("\nDeleting value from cell #3 of the array...");
        System.out.println("Before deleting:");
        sda.traverseArray();
        sda.deleteValueFromArray(3);
        System.out.println("After deleting:");
        sda.traverseArray();


    }
}