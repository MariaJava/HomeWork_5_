package com.company;

public class Main {

    public static void main(String[] args) {

        int[] mac1 = new int[10];
        int[] mac2 = new int[10];

        for (int i = 0; i < 10; i++) {
            mac1[i] = (int) (Math.random() * 11);
            mac2[i] = (int) (Math.random() * 11);
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            a += mac1[i]; //a1 = a1 + a[i];
            b += mac2[i];
        }
        a /= mac1.length;
        b /= mac2.length;
        if (a < b)
            System.out.print("Cреднее арифметическое второго массива: " + b + " - больше чем у первого!");

        else if (a > b)
            System.out.println("Cреднее арифметическое первого массива: " + a + " - больше чем у второго!");
        else
            System.out.println("Среднее арифметическое массивов равны их значение: " + a + "!");

    }
}
