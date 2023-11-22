package org.jshap;

import org.javatuples.Pair;
import java.util.HashSet;
import java.util.Set;

/**
 * Сущность подразделение
 * @author jshap
 */
public class Division {
    private static Set<Pair<Integer, String>> names = new HashSet<>();
    private static int IDCount = 1;
    private final int ID;
    private String name;

    /**
     * Конструктор с параметром
     * @param name имя подразделения
     */
    public Division(String name) {
        boolean isContained = false;
        int nextID = IDCount;

        for (Pair<Integer, String> pair: names) {
            if (name.equals(pair.getValue1())) {
                nextID = pair.getValue0();
                isContained = true;

                break;
            }
        }

        if (!isContained) {
            names.add(Pair.with(nextID, name));
            ++IDCount;
        }

        ID = nextID;
        this.name = name;
    }

    /**
     * Переопределённый метод toString
     * @return строка с информацией о значениях полей класса
     */
    @Override
    public String toString() {
        return "[ID: " + ID + " name: " + name + "]";
    }
}
