package org.jshap;

/**
 * Сущность подразделение
 * @author jshap
 */
public class Division {
    private final int ID;
    private String name;

    /**
     * Конструктор с параметром
     * @param name имя подразделения
     */
    public Division(String name) {
        ID = name.hashCode(); // некрутая реализация
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
