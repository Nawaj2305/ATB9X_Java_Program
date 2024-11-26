package Task.Task_18102024_Switch_Statement;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any Month number");
        int month =sc.nextInt();

        switch(month){
            case 1:
            System.out.println("Its a January");
            break;

            case 2:
                System.out.println("Its a Februry");
                break;

            case 3:
                System.out.println("Its a March");
                break;

            case 4:
                System.out.println("Its a April");
                break;

            case 5:
                System.out.println("Its a May");
                break;

            case 6:
                System.out.println("Its a June");
                break;

            case 7:
                System.out.println("Its a Jully");
                break;

            case 8:
                System.out.println("Its a August");
                break;

            case 9:
                System.out.println("Its a September");
                break;

            case 10:
                System.out.println("Its a October");
                break;

            case 11:
                System.out.println("Its a November");
                break;

            case 12:
                System.out.println("Its a December");
                break;

            default:
                System.out.println("I don't no");
        }
    }
}
