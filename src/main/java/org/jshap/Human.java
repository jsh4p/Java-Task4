package org.jshap;

/**
 * Сущность человек
 * @author jshap
 */
public class Human {
    private final int ID;
    private String name;
    private String gender; // гендеров много, boolean не сделать
    private String birthday;
    private Division division;
    private int salary;

    /**
     * Конструктор с параметром
     * @param array массив строк, содержащий поля класса
     * @throws IllegalArgumentException неправильная длина массива
     */
    public Human(String[] array) {
        if (array.length != 6) {
            throw new IllegalArgumentException("Expected array length: 6, but got: " + array.length);
        }

        ID = Integer.parseInt(array[0]);
        name = array[1];
        gender = array[2];
        birthday = array[3];
        division = new Division(array[4]);
        salary = Integer.parseInt(array[5]);
    }

    /**
     * Конструктор с параметрами
     * @param ID персональный номер
     * @param name имя
     * @param gender пол
     * @param birthday день рождения
     * @param division имя подразделения
     * @param salary зарплата
     */
    public Human (int ID, String name, String gender,
                  String birthday, Division division, int salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.division = division;
        this.salary = salary;
    }

    /**
     * Переопределённый метод toString
     * @return строка с информацией о значениях полей класса
     */
    @Override
    public String toString() {
        return "[ID: " + ID + " name: " + name + " gender: " + gender +
                " birthday: " + birthday + " division: " + division.toString() + " salary: " + salary + "]";
    }
}
