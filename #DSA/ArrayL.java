import java.util.ArrayList;
import java.util.Collections;
public class ArrayL{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // get element 
        int element = list.get(2);
        System.out.println(element);

        // add element
        list.add(2,9);

        // set element 

        list.set(0,10);

        // sorting

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
    }
}