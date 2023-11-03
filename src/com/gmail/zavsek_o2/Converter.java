package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Converter {


    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть операцію (1 - милі в кілометри, 2 - кілометри в милі): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введіть відстань в милях: ");
            double miles = scanner.nextDouble();
            double kilometers = milesToKilometers(miles);
            System.out.println(miles + " миль = " + kilometers + " кілометрів");
        } else if (choice == 2) {
            System.out.print("Введіть відстань в кілометрах: ");
            double kilometers = scanner.nextDouble();
            double miles = kilometersToMiles(kilometers);
            System.out.println(kilometers + " кілометрів = " + miles + " миль");
        } else {
            System.out.println("Неправильний вибір");
        }

        scanner.close();
    }
}