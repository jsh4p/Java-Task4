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
     * @throws NullPointerException ссылка не указывает на строку
     */
    public Human(String[] array) {
        if (array.length != 6) {
            throw new IllegalArgumentException("Expected array length: 6, but got: " + array.length);
        }

        if (array[1] == null || array[2] == null || array[3] == null || array[4] == null) {
            throw new NullPointerException();
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
     * @throws NullPointerException ссылка не указывает на строку
     */
    public Human (int ID, String name, String gender,
                  String birthday, Division division, int salary) {
        if (name == null || gender == null || birthday == null) {
            throw new NullPointerException();
        }

        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.division = division;
        this.salary = salary;
    }

    // Геттеры и сеттеры

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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
