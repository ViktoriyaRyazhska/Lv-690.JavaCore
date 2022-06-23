package HW8_Collections;

import java.util.*;
import java.util.ArrayList;


public class Lists {

    public static void main(String[] var) {

        List <Integer> myCollection = returnArList();
        System.out.println(myCollection);

        LinkedList <Integer> newCollection = new LinkedList<>();

        for (int i=5;i < myCollection.size();i++) {
                newCollection.add(myCollection.get(i));
        }

        System.out.println(newCollection);

        for (int i=0;i < myCollection.size();i++) {
           if (myCollection.get(i)>20) {
               myCollection.remove(i);
               i--;
           }
        }
        System.out.println(myCollection);

        //Insert elements 1, -3, -4 in positions 2, 8, 5
        insertInList(2,1, (ArrayList) myCollection);
        insertInList(8,-3, (ArrayList) myCollection);
        insertInList(5,-4, (ArrayList) myCollection);

        myCollection.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o1-o2;
            }
        });

        for (int i=0;i < myCollection.size();i++) {
            System.out.println("position:"+(i+1) +", value of element:"+myCollection.get(i));
        }
    }
    public static List<Integer> returnArList(){
       List <Integer> myCollection = new ArrayList<>();
       myCollection.add(0,5);
       myCollection.add(8);
       myCollection.add(3);
       myCollection.add(25);
       myCollection.add(11);
       myCollection.add(4);
       myCollection.add(78);
       myCollection.add(54);
       myCollection.add(98);
       myCollection.add(9,100);

       return myCollection;
    }
    public static void insertInList(int i, int val,ArrayList arrayList){

        if (i<=arrayList.size()) arrayList.set(i - 1, val);
        else
            System.err.println("Position "+i + " was removed");
    }


}
