package org.jshap;

public class Human {
    private final int ID;
    private String name;
    private String gender; // гендеров много, boolean не сделать
    private String birthday;
    private Division division;
    private int salary;

    public Human(String[] array) {
        if (array.length != 6) {
            throw new IllegalArgumentException("Inappropriate number of fields");
        }

        ID = Integer.parseInt(array[0]);
        name = array[1];
        gender = array[2];
        birthday = array[3];
        division = new Division(array[4]);
        salary = Integer.parseInt(array[5]);
    }

    public Human (int ID, String name, String gender,
                  Division division, int salary, String birthday) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " name: " + name + " gender: " + gender +
                " division: [" + division.toString() + "] salary: " + salary + " birthday: " + birthday;
    }
}
