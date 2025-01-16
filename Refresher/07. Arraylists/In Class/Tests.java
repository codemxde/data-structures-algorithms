import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {
    
    public static void main(String[] args) {
        // # Trying Arrays.asList() feature
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("List: " + list);

        // * Clearing list
        list.clear();

        // # 1. Trying Arrays.asList() using actual array
        int[] arr = {4, 5, 6};
        // $ list = new ArrayList<>(Arrays.asList(arr));
        // * Nope, doesn't work and throws an error actually

        // # 2. You can do that using Strings array though!
        String[] strArr = {"Keshav", "Rachit", "Jai"};
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArr));
        System.out.println("String array as list: " + strList);
        // ! OUTPUT:
        // $ String array as list: [Keshav, Rachit, Jai]

        // # 3. What if we used 'List' instead of ArrayList ?
        List list2 = Arrays.asList(arr);
        System.out.println("List 2: " + list2);
        // * Doesn't throw an error, but prints out super weird stuff
        // ! OUTPUT:
        // $ List 2: [[I@6b95977]
    }
}
