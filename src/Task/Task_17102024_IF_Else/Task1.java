package Task.Task_17102024_IF_Else;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){
        System.out.println("Enter the Score");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        char Grade;

        if(score>=90 && score<=100){
            Grade='A';
           System.out.println("Your Grade is "+Grade);
        }
        else if(score>=80 && score<=89){
            Grade='B';
            System.out.println("Your Grade is "+Grade);
        }
        else if(score>=70 && score<=79){
            Grade='C';
            System.out.println("Your Grade is "+Grade);
        }
        else if(score>=60 && score<=69){
            Grade='D';
            System.out.println("Your Grade is "+Grade);
        }
        else if(score<=50 && score>=0){
            Grade='F';
            System.out.println("Your Grade is "+Grade);
        }
        else if(score<0 || score>100){
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
