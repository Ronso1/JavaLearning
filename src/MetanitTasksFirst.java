import java.util.Scanner;

public class MetanitTasksFirst {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        task5();
    }

    public static void task1() {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt(), secondNumber = input.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " равен " + secondNumber);
        }
        else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " больше " + secondNumber);
        }
        else {
            System.out.println(firstNumber + " меньше " + secondNumber);
        }
        input.close();
    }

    public static void task2() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 2 && number < 9) {
            System.out.println("Число больше 2, но меньше 9");
        }
        else {
            System.out.println("Неизвестное число");
        }
        input.close();
    }

    public static void task3() {
        Scanner input = new Scanner(System.in);

        float userNumber;
        float percentageBeforeHundred = 5f, percentageAfterHundred = 7f;
        float percentageAfterTwoHundred = 10f;
        float result = 0f;

        System.out.print("Введите начальную сумму: ");
        userNumber = input.nextFloat();

        if (userNumber >= 100 && userNumber <= 200) {
            result += userNumber + percentageAfterHundred / 100 * userNumber;
        }
        else if (userNumber < 100) {
            result += userNumber + percentageBeforeHundred /100 * userNumber;
        }
        else {
            result += userNumber + percentageAfterTwoHundred / 100 * userNumber;
        }

        System.out.printf("Сумма вклада после начисления процентов: %f", result);
        input.close();
    }

    public static void task4() {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Введите номер операции:
                1. Сложение
                2. Вычитание
                3. Умножение""");

        int userNumber = input.nextInt();

        switch (userNumber) {
            case 1:
                System.out.println("Сложение");
                break;
            case 2:
                System.out.println("Вычитание");
                break;
            case 3:
                System.out.println("Умножение");
                break;
            default:
                System.out.println("Операция неопределена");
                break;
        }
        input.close();
    }

    public static void task5() {
        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.print("Введите первое число: ");
        int firstNumber = input.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = input.nextInt();

        System.out.println("""
                Введите номер операции:
                1. Сложение
                2. Вычитание
                3. Умножение""");

        int userNumber = input.nextInt();

        switch (userNumber) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Операция неопределенна");
                break;
        }

        if (userNumber >= 1 && userNumber <= 3) {
            System.out.println("Результат операции: " + result);
        }
        else {
            System.out.println("Неизвестная операция");
        }
        input.close();
    }
}