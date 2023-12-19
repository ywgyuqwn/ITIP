import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ошибка: введено неверное значение.");
                return;
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            try {
                sum += array[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: выход за границы массива.");
                return;
            }
        }

        double average = (double) sum / size;
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}