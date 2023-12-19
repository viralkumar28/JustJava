import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int ele = list.get(0);
        System.out.println(ele);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element(remove element from a certain location)
        list.set(2,6);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //count size of a ArrayList
        int size = list.size();
        System.out.println(size);

        //loops in ArrayList
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
