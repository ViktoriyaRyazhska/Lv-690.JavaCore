package Homework.lesson7.task2;

import java.util.Comparator;

public class ComparatorPasaggers implements Comparator<Passagers> {
    @Override
    public int compare(Passagers o1, Passagers o2) {
        return o1.getPasagers() - o2.getPasagers();
    }
}
