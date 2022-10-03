import java.util.Arrays;

public class Main {

    public static int[] expenses = null;
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        expenses = generateRandomArray();
        task1();
        task2();
        task3();
        task4();

    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i-- ) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static void task3() {
        int[] expenses = generateRandomArray();
        int sum = 0;
        double averageSum = 0;
        for (int i = 0; i < expenses.length ; i++) {
            sum += expenses[i];
        }
        averageSum = (double) sum / expenses.length;
        System.out.println("Средныы сумма за месяц составила " + averageSum + " рублей");
    }

    private static void task2() {
        int[] expenses = {11,9,54,73,23};
        int min = expenses[0];
        int max = expenses[0];
        for (int i = 1; i < expenses.length; i++ ) {
            if (min > expenses[i]) {
                min = expenses[i];
            }
            if (max < expenses[i]) {
                max = expenses[i];

            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + "." +
                " Максимальная сумма трат за день составила " + max);

        int min2 = expenses[0];
        int max2 = expenses[0];
        for (int num : expenses) {
            if (min2 > num) {
                min2 = num;
            }
            if (max2 < num) {
                max2 = num;

            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + "." +
                " Максимальная сумма трат за день составила " + max);


    }

    private static void task1() {
        int sum = 0;
        for (int i = 0; i < expenses.length ; i++) {
            sum += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    }

