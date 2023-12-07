import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List (ArrayList in this case)
        List<String> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");

        // Displaying the elements of the list
        System.out.println("Original List: " + myList);

        // Adding an element at a specific index
        myList.add(2, "Pineapple");

        // Displaying the updated list
        System.out.println("List after adding 'Pineapple' at index 2: " + myList);

        // Removing an element by value
        myList.remove("Banana");

        // Displaying the list after removing 'Banana'
        System.out.println("List after removing 'Banana': " + myList);

        // Checking if the list contains a specific element
        if (myList.contains("Grapes")) {
            System.out.println("'Grapes' is present in the list.");
        }

        // Getting the size of the list
        System.out.println("Size of the list: " + myList.size());

        // Iterating through the list and printing each element
        System.out.print("Elements of the list: ");
        for (String fruit : myList) {
            System.out.print(fruit + " ");
        }
    }
}
