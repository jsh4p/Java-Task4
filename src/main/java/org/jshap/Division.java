package org.jshap;

public class Division {
    private final int ID;
    private String name;

    public Division(String name) {
        ID = name.hashCode(); // некрутая реализация
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " name: " + name;
    }
}
