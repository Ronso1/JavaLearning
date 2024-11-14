import java.util.Scanner;

public class MetanitTasksSecond {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        task6();
    }

    private static void task1() {
        int population = 10_000_000;
        int death = 8;
        int birth = 14 - death;

        for (int i = 0; i < 10; i++) {
            population += population * birth / 1000;
        }

        System.out.println(population);
    }

    private static void task2() {
        int population = 10_000_000;
        int birth = 14;
        int death = 8;
        int dif = 0;

        for (int i = 0; i < 10; i++) {
            if (birth > 7) {
                birth--;
            }

            if (death > 6) {
                death--;
            }

            dif = birth - death;
            population += population * dif / 1000;
        }

        System.out.println(population);
    }

    private static void task3() {
        Scanner input = new Scanner(System.in);
        float userValue, percentage = 7f;
        int userLength;

        System.out.print("Введите сумму вклада: ");
        userValue = input.nextFloat();
        System.out.print("Введите срок в мясецах: ");
        userLength = input.nextInt();

        for (int i = 0; i < userLength; i++) {
            userValue += userValue * (percentage / 100);
        }

        System.out.println("После " + userLength + " месяцев сумма вклада составит: " + userValue);
        input.close();
    }

    private static void task4() {
        Scanner input = new Scanner(System.in);
        float userValue, percentage = 7f;
        int userLength, cnt;

        System.out.print("Введите сумму вклада: ");
        userValue = input.nextFloat();
        System.out.print("Введите срок в мясецах: ");
        userLength = input.nextInt();
        cnt = userLength;

        while (cnt != 0) {
            userValue += userValue * (percentage / 100);
            cnt--;
        }

        System.out.println("После " + userLength + " месяцев сумма вклада составит: " + userValue);
        input.close();
    }

    private static void task5() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }

    private static void task6() {
        Scanner input = new Scanner(System.in);
        int firstUserNumber, secondNumber, choice;
        boolean flag = true;

        while (flag) {
            System.out.print("Введите первое число: ");
            firstUserNumber = input.nextInt();
            System.out.print("Введите второе число: ");
            secondNumber = input.nextInt();

            System.out.println("Результат умножения: " + firstUserNumber * secondNumber);
            System.out.println("Вы хотите умножить другие числа? Если да, наберите любое число кроме 1.");
            choice = input.nextInt();

            if (choice == 1) {
                flag = false;
            }
        }
        input.close();
    }
}