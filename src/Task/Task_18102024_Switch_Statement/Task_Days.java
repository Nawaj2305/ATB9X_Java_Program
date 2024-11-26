package Task.Task_18102024_Switch_Statement;

import java.util.Scanner;

public class Task_Days {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any day from 0 to 7");
        int day=sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Its a Monday");
                break;
            case 2:
                System.out.println("Its a Tuesday");
                break;
            case 3:
                System.out.println("Its a Wenesday");
                break;
            case 4:
                System.out.println("Its a Thuesday");
                break;
            case 5:
                System.out.println("Its a Friday");
                break;
            case 6:
                System.out.println("Its a Satturday");
                break;
            case 7:
                System.out.println("Its a Sunday");
                break;

            default:
                System.out.println("I don't know which day it is");
                break;
        }
    }
}
