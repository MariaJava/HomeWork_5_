package homework_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] mas = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int s = 0; s < 10; s++) {
            System.out.println("Введите число в " + s + " ячейку массива!");
            mas[s] = sc.nextInt();
        }

        for (int s = 0; s < mas.length; s++)
            System.out.print(mas[s] + "; ");

    }
}
