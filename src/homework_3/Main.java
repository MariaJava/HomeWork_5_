package homework_3;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Cамое маленькое значение " + min);

        int max = array[0];
        for (int y = 0; y < array.length; y++) {
            if (array[y] > max) {
                max = array[y];
            }
        }
        System.out.println("Самое большое значение " + max);
    }
}
