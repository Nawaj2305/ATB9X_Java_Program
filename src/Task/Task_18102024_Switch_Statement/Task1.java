package Task.Task_18102024_Switch_Statement;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(" 1 - Add 2 - Subtraction 3 - Multiply  4 - Divide 5 - Modulus");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1 = sc.nextInt();

        System.out.println("Enter the Num2");
        int num2 = sc.nextInt();

        System.out.println("Enter the Operator");
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println(num1 / num2);
                break;

            case 5:
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("wrong number");
                break;

        }
    }
}
