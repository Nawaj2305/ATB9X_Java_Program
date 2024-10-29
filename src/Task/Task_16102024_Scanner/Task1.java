package Task.Task_16102024_Scanner;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your Name=");
        String Name= scanner.nextLine();

        System.out.println("Enter your age=");
        int age=scanner.nextInt();

        System.out.println("Enter your Salary=");
        int salary=scanner.nextInt();

        System.out.println("Name ="+Name);
        System.out.println("age ="+age);
        System.out.println("Salary ="+salary);

        scanner.close();
    }
}
