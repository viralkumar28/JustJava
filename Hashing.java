import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //size
        System.out.println(set.size());
        //Search
//        if(set.contains(1)){
//            System.out.println("Contains 1");
//        }
//        if(!set.contains(6)){
//            System.out.println("Does not contain 6");
//        }
//        //Delete
//        set.remove(1);
//        if (!set.contains(1)){
//            System.out.println("Does not contain 1");
//        }

        System.out.println(set);
        //Iterater
        Iterator it  = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
