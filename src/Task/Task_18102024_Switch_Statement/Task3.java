package Task.Task_18102024_Switch_Statement;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice (1 or 2):");
        int choice = sc.nextInt();

        switch (choice){

            case 1:
                System.out.println("Enter Kilometer:");
                double km = sc.nextDouble();
                double miles = (km * 0.621371);
                System.out.println("The converted value of KM to Miles is "+miles);
                break;

            case 2:
                System.out.println("Enter fahrenheit:");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.println("The converted value of Fahrenheit to Celsius is "+celsius);
                break;

            default:
                System.out.println("Invalid number");
                break;

        }
        sc.close();

    }
}
