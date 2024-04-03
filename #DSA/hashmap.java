import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        // Country(key), population(value) 
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120000);
        map.put("China", 11000);
        map.put("Pakistan",140000);
        System.out.println(map);
        // System.out.println(map.size());

        // Search
        // if(map.containsKey("China")){
        //     System.out.println("Present in the map");
        // }   else{
        //     System.out.println("Not present in the map");
        // }

        // // get function  --- agar key exist karti hai to value dega otherwise null
        // // containskey ----- agar key exist karti hai to true dega otherwise false

        // System.out.println(map.get("India"));
        // System.out.println(map.get("Indonesia"));

        // Iteration in HashMap

        // int[] arr = {12,13,14};
        // for(int i = 0; i < 3 ; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();


        // for wala tarika use karna hai

        // for(Map.Entry<String, Integer> e : map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // Set<String> keys = map.keySet();
        // for(String key : keys){
        //     System.out.println(key + " " + map.get(key));
        // }
    }
}
