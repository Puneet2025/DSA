import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {

        // Create
        HashSet <Integer> set = new HashSet<>();

        // // Insert 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        // // Search 

        // if(set.contains(4)){
        //     System.out.println("Set contains 4");
        // }
        // if(!set.contains(7)){
        //     System.out.println("Set does not contain 7");
        // }

        // // delete 

        // set.remove(5);
        // if(!set.contains(5)){
        //     System.out.println("Does not contain 5");
        // }

        System.out.println(set);
        // System.out.println(set.size());

        // Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
