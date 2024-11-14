import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        doubleRofl();
    }

    public static void testNumbers() {
        int num1 = 4;
        int num2 = 5;
        int num3 = 15;
        int num4 = 10;
        int num5 = 5;
        int result = 12;

        result += num1 * num2 + num3 % num4 / num5;
        System.out.println(result);
    }

    public static void inputOutputTest() {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();

        System.out.println(a);
        input.close();
    }

    public static void doubleRofl() {
        double x = 8.8;
        double y = 1.5;
        double z = x - y;
        System.out.println(z);
    }
}
