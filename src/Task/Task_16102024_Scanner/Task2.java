package Task.Task_16102024_Scanner;

public class Task2 {
//Maximum number using parameters

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int max = a > b ? a : b;
        System.out.println("The Maximum number is " +max);

    }
}
