package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Line> list = new ArrayList();
        list.add(new Line(new Point(3 ,4) , new Point(4 , 2) ));
        list.add(new Line(new Point(2 ,5) , new Point(7 , 3) ));
        list.add(new ColorLine(new Point(1 , 7) , new Point(3 ,2) , "Yellow"));
        list.add(new ColorLine(new Point(-1 , -7) , new Point(-3 ,-2) , "Red"));

        for (Line i : list){
            System.out.println(i.print());
        }
    }
}
