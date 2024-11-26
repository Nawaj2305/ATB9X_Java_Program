package Task.Task_23102024_Function;

import java.util.Scanner;


public class Task {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Num1 = ");
        int a= sc.nextInt();

        System.out.println("Enter the Num2 = ");
        int b=sc.nextInt();

        int result_of_sum = sum(a,b);
        System.out.println("The Sum of Numbers = "+result_of_sum);

        int result_of_sub = sub(a,b);
        System.out.println("The Sub of Numbers = "+result_of_sub);

        int result_of_mul = mul(a,b);
        System.out.println("The Mul of Numbers = "+result_of_mul);

        int result_of_mod = mod(a,b);
        System.out.println("The Mod of Numbers = "+result_of_mod);

    }

    private static int sum(int a, int b) {
        return a+b;
    }

    private static int sub(int a, int b) {
        return a-b;
    }

    private static int mul(int a, int b) {
        return a*b;
    }

    private static int mod(int a, int b) {
        return a%b;
    }

}
