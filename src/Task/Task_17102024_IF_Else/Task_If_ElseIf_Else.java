package Task.Task_17102024_IF_Else;

import java.util.Scanner;

public class Task_If_ElseIf_Else {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1=sc.nextInt();
        System.out.println("Enter the Num2");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("The Number1 is greater than Number2");
        }
        else if(num2>num1){
            System.out.println("The Number2 is greater than Number1");
        }
        else{
            System.out.println("The Number1 is equal to Number2");
        }
    }
}
