package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Converter {
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System);
        System.out.println("Выберите операцию (1 - мили в километры, 2 - километры в мили): ");
        int choice = scanner.nextInt();
    }
}