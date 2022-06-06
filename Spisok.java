package Lesson5;

public class Spisok {

    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;
    public Spisok(String rabochie, String mesto_v_collektive, String pochta, String telephon, int zarplata, int age_Rab){

        name = rabochie;
        position = mesto_v_collektive;
        email = pochta;
        phone_number = telephon;
        salary = zarplata;
        age = age_Rab;
        }

    public void print() {
        System.out.println(name + " " + position  + " " + email + " " + phone_number + " " + salary + " " + salary + " " + age);
        }
    }



