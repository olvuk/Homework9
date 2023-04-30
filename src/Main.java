import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int total = IntStream.of(arr).sum();
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
        System.out.println();
        }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxExpense = -1;
        for (final int current : arr) {
            if (current > maxExpense) {
                maxExpense = current;
            }
        }
        int minExpense = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей.");
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int total = IntStream.of(arr).sum();
        double average = total/30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}