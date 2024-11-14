import java.util.Scanner;

public class MetanitTasks {
    public static void main(String[] args) {
        //task1();
        task2();
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

    }
}
