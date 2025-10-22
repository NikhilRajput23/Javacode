import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Integer type ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10); // add at end
        numbers.add(20);
        numbers.add(30);
        

        // Adding at specific index
        numbers.add(1, 15); // insert 15 at index 1

        System.out.println("ArrayList: " + numbers);

        // Accessing element by index (fast)
        System.out.println("Element at index 2: " + numbers.get(2));

        // Removing element by index (slow in middle)
        numbers.remove(1);
        System.out.println("After removing index 1: " + numbers);
   numbers.sort((a,b)->(b-a));
   System.out.println("Array.sort->"+numbers);
        // Iterating ArrayList
        System.out.println("Iterating:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
