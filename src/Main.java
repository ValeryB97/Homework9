public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] payments = {48342, 34901, 68239, 21003, 95043};
        int summary = 0;
        for (int index = 0; index < payments.length; index++) {
            summary = summary + payments[index];
        }
        System.out.println("Сумма трат за месяц составила " + summary + " рублей");
        // Задание 2
        int[] spending = {28374, 78543, 5434, 80542, 44234};
        int minSpending = spending[0];
        int maxSpending = spending[0];
        for (int i = 0; i < spending.length; i++) {
            if (spending[i] > maxSpending) {
                maxSpending = spending[i];
            } else if (spending[i] < minSpending) {
                minSpending = spending[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSpending + " рублей");
        System.out.println("Минимальна сумма трат за неделю составила " + minSpending + " рублей");
        // Задание 3
        double[] averageSpend = {9032.43, 11234, 4567.12, 2395.65, 36718};
        double sum = 0;
        for (double element : averageSpend) {
            sum = sum + element;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / 4 + " рублей");
        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i >= 0) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}