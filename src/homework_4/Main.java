package homework_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Введите значение массива(10 значений)");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Значения в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
