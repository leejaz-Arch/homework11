import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] inputArray1 = {12345, 23456, 8765, 41234, 11111};

        int sum = 0;

        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int i = 0; i < inputArray1.length; i++) {
            sum += inputArray1[i];

            if (inputArray1[i] > max) {
                max = inputArray1[i];
            }

            if (inputArray1[i] < min) {
                min = inputArray1[i];
            }
        }

        double average = (double) sum / inputArray1.length;

        double[] outputArray1 = {sum, max, min, average};

        System.out.println("Входные данные (inputArray1): " + Arrays.toString(inputArray1));
        System.out.println("Результаты для бухгалтерии (outputArray1): " + Arrays.toString(outputArray1));


        System.out.println("Задание №2");

        int[] inputArray2 = {50000, 75000, 120000, 45000, 98500};

        double[] outputArray2 = new double[inputArray2.length];

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        System.out.println("Зарплаты сотрудников (inputArray2): " + Arrays.toString(inputArray2));
        System.out.println("НДФЛ 13% для каждой зарплаты (outputArray2): " + Arrays.toString(outputArray2));


        System.out.println("Задание №3");

        int[] inputArray3 = {3000, 7500, 5000, 12000, 4999};

        boolean[] outputArray3 = new boolean[inputArray3.length];

        for (int i = 0; i < inputArray3.length; i++) {

            outputArray3[i] = inputArray3[i] > 5000;
        }

        System.out.println("Бонусы сотрудников (inputArray3): " + Arrays.toString(inputArray3));
        System.out.println("Флаги 'бонус выше 5000' (outputArray3): " + Arrays.toString(outputArray3));


        System.out.println("Задание №4");

        int[] inputArray4 = {15000, 8000, -2000, 12000, 5000};

        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;

        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] < 0) {

                outputArray4[0] = false;
                break;
            }
        }

        System.out.println("Остатки на счете по месяцам (inputArray4): " + Arrays.toString(inputArray4));
        System.out.println("Есть ли просрочки (outputArray4): " + Arrays.toString(outputArray4));


        System.out.println("Задание №5");

        int[] inputArray5 = {150000, -30000, 85000, 0, 120000};

        int[] outputArray5 = new int[1];

        for (int i = 0; i < inputArray5.length; i++) {
            if (inputArray5[i] > 0) {
                outputArray5[0]++;
            }
        }

        System.out.println("Прибыль по месяцам (inputArray5): " + Arrays.toString(inputArray5));
        System.out.println("Количество рентабельных месяце (outputArray5): " + Arrays.toString(outputArray5));

    }
}