//Declare collection myCollection of 10 integers and fill it (from the console or random).
//        Find and save in list newCollection all positions of element more than 5 in the collection.
//        Print newCollection
//        Remove from collection myCollection elements, which are greater then 20. Print result
//        Insert elements 1, -3, -4 in positions 2, 8, 5.
//        Print result in the format: “position – xxx, value of element – xxx”
//        Sort and print collection

package PracticalTask_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void checkPosition(List<Integer> list, int position, int value) {
        if (list.size() > position) {
            list.add(position, value);
        } else {
            System.out.println("виходить за межі позиція----" + position);
        }
    }


    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < +10; i++)
            myCollection.add(i * 4);
        System.out.println(myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }

        }
        System.out.println(newCollection + "створили нову колкцію,де усі елементи більші 5");
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println(myCollection + "видалили з колекції усі елементи,що більші 20");

        checkPosition(myCollection, 2, 1);
        checkPosition(myCollection, 8, -3);
        checkPosition(myCollection, 5, 4);


//        int Positions1=2;
//        int Positions5=5;
//        int Positions8=8;

//        if(myCollection.size()>2){
//            myCollection.add(2,1);
//        }
//        if(myCollection.size()>=8){
//            myCollection.add(8,-3);
//
//        }
//        if(myCollection.size()>=5){
//            myCollection.add(5,-4);
//
//        }
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("   Position - " + i + "   value of element " + myCollection.get(i));
        }


        System.out.println(myCollection + "додали до колекції ще кілька елементів");
        myCollection.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(myCollection + "в порядку зростання сортування");

    }

}
