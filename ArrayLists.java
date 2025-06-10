import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // creates new empty ArrayList of ints
        ArrayList<Integer> nums = new ArrayList<>(); 
        // appends a element to the end of the ArrayList
        nums.add(12);
        nums.add(2);
        nums.add(5);
        nums.add(9);
        // sets 2nd item to 5
        nums.set(1, 5);
        // prints out 3rd item
        System.out.println(nums.get(2)); // prints 5
        // prints out the size of the ArrayList
        System.out.println(nums.size()); // prints 4
        for (int i = 0; i < nums.size(); i++) {
            // prints out each item in the ArrayList
            System.out.println(nums.get(i));
        }
    }
}
