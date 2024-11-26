package Task.Task_17102024_IF_Else;

import java.util.Scanner;

public class Task_Even_Odd {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
        sc.close();

    }
}
