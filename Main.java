package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] firm = new String[]{"Rolex", "Chanel", "Tissot"};
        String[] mark = new String[]{"Submariner", "Explorer", "J12", "Première", "Gabrielle", "TAG HEUER", "Carrera", "Aquaracer"};
        Object[][] mixedArray = new Object[][]{
                {firm[0], mark[0]}, // Rolex
                {firm[0], mark[1]}, // Rolex
                {firm[1], mark[2]}, // Chanel
                {firm[1], mark[3]}, // Chanel
                {firm[1], mark[4]}, // Chanel
                {firm[2], mark[5]}, // Tissot
                {firm[2], mark[6]}, // Tissot
                {firm[2], mark[7]}  // Tissot
        };

        ArrayList<Object[]> buyers = new ArrayList<>();
        System.out.println("Введите ФИО:");
        String fullName = s.nextLine();

        System.out.println("Введите email:");
        String email = s.nextLine();

        System.out.println("Введите номер телефона:");
        String phoneNumber = s.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Выберите фирму часов:");
            for (int j = 0; j < firm.length; j++) {
                System.out.println((j + 1) + ". " + firm[j]);
            }
            int firmChoice = Integer.parseInt(s.nextLine()) - 1;

            // Выводим только модели часов, соответствующие выбранной фирме
            System.out.println("Выберите модель часов:");
            for (int j = 0; j < mark.length; j++) {
                if (mixedArray[j][0].equals(firm[firmChoice])) {
                    System.out.println((j + 1) + ". " + mark[j]);
                }
            }
            int markChoice = Integer.parseInt(s.nextLine()) - 1;

            System.out.println("Введите количество товара:");
            int quantity = Integer.parseInt(s.nextLine());

            buyers.add(new Object[]{fullName, email, phoneNumber, firm[firmChoice], mark[markChoice], quantity});
        }

        for (Object[] buyerInfo : buyers) {
            System.out.println("Информация о покупателе:");
            System.out.println("ФИО: " + buyerInfo[0]);
            System.out.println("Email: " + buyerInfo[1]);
            System.out.println("Номер телефона: " + buyerInfo[2]);
            System.out.println("Заказ:");
            System.out.println("Фирма: " + buyerInfo[3]);
            System.out.println("Модель: " + buyerInfo[4]);
            System.out.println("Количество: " + buyerInfo[5]);
            System.out.println();
        }
    }
}