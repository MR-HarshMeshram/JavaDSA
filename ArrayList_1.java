import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        // Integer class
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);

        // Get element
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Add element in between
        list.add(1, 10);
        System.out.println("After adding 10 at index 1: " + list);

        // Set element
        list.set(1, 100);
        System.out.println("After setting index 1 to 100: " + list);

        // Delete element
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        // Size
        System.out.println("Size of the list: " + list.size());

        // Loop in ArrayList
        System.out.print("Elements in the list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }
    }
}
