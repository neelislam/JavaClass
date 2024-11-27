import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.swap;
public class Main {
    public static void main(String[] args) {
        /*
        System.out.print("Before swap: ");
        Integer[] Number= {1,2,3,4};
        for(int i: Number){
            System.out.print( i +" ");
        }

        Swapgene.swap(Number, 0,3);
        System.out.print("\nAfter swap: ");
        for(int num : Number){
            System.out.print(num + " ");
        }
        System.out.println("");
/// ekhan theke
        //Type safety
        List list = new ArrayList();
        list.add(10);
        list.add("10");
        for(Object i : list){
            System.out.print(i + " ");
        }
        //With Generics, it is required to specify the type of object we need to store.
        List<Integer> list2 = new ArrayList<Integer>();
        list.add(100);
        //list.add("10");// compile-time error


        //Type casting not required
        List list3 = new ArrayList();
        list3.add("hello");//0
        list3.add("Bishaler nunu choto");//1
        String s = (String) list3.get(1);//typecasting
        for(Object i : list3){
            System.out.print(i + " ");
        }
        System.out.print(s);
        //After Generics, we don't need to typecast the object.
        List<String> list4 = new ArrayList<String>();
        list4.add("Bishal Er nunu boro");
        String s1 = list4.get(0);
        for(Object i : list4){
            System.out.println(i + " ");
        }
        System.out.println(s1);


        //example

        ArrayList<String> list5=new ArrayList<String>();
        list5.add("rahul");
        list5.add("jai");
        //list.add(32);//compile time error
        for(Object i : list5){
            System.out.println(i + " ");
        }

         */

        ArrayList<String> list=new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        //list.add(32);//compile time error

        String s=list.get(1);//type casting is not required
        System.out.println("element is: "+s);

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

