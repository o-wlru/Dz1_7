package ru.sky.pro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        // Задание 2
        System.out.println("Задание 2");
        String fullNameUp = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        // Задание 3
        System.out.println("Задание 3");
        String fullNameProp = fullName.replace(' ', ';');
        //почему, почему при попытке заменить " " на "; " появляется красное подчеркивание замены???
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameProp);

        // Задание 4
        System.out.println("Задание 4");
        String fullName1 = ("Иванов Семён Семёнович");
        String fullName1New = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName1New);


    }
}
