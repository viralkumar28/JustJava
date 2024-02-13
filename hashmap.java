import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        //Insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //Search
        if(map.containsKey("Indo")){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }

        System.out.println(map.get("China"));//key exist
        System.out.println(map.get("Indo"));//key doesn't exist

//        int[] arr = {12,15,18};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for(int val : arr){
//            System.out.print(val+" ");
//        }

        //For loop (HashMap)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+" "+map.get(key));
        }

        //Remove
        map.remove("China");
        System.out.println(map);

    }
}
