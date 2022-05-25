package HomeWork.NameTree;

import java.util.*;

public class NameTree {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        TreeMap<String, String> NameTree = new TreeMap<>();
        int i = 0;
        int treeIndex = 7;

        NameTree.put("Aron", "Turner");
        NameTree.put("Peter", "Steel");
        NameTree.put("Mark", "Benson");
        NameTree.put("Salma", "Winter");
        NameTree.put("Morgan", "Jenkins");
        NameTree.put("Sam", "Black");
        NameTree.put("Pablo", "Wiz");

        System.out.println(NameTree);

        for (Map.Entry<String, String> e : NameTree.entrySet()) {
            if (NameTree.containsKey(e.getKey())) {
                i++;
            }
        }
        if (i == treeIndex) {
            System.out.println("All name are different");
        } else {
            System.out.println("You have same name");
        }

        System.out.println("Input name what you want remove");
        String name = sc.next();

        if(NameTree.containsKey(name)){
            System.out.println("User " + name + " removed");
            NameTree.remove(name);
        }


        System.out.println(NameTree);


    }
}
