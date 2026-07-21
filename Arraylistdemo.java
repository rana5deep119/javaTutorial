import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<Integer>();

        list.add(23);
        list.add(54);
        list.add(77);
        list.add(29);

        System.out.println(list);
        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        list.set(1,500);
        System.out.println(list);

        list.add(2,200);
        System.out.println(list);

         System.out.println("the size of list is: " + list.size());

        for(int arr:list){
            System.out.println(arr);
        }

         Collections.sort(list);
         System.out.println(list);

    }
}