package Task.Task_17102024_IF_Else;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Side1");
        int Side1=sc.nextInt();

        System.out.println("Enter the Side2");
        int Side2=sc.nextInt();

        System.out.println("Enter the Side3");
        int Side3=sc.nextInt();

        if(Side1<=0 || Side2<=0 || Side3<=0){
            System.out.println("Invalid Input: Sides must be positive");
        }
        else if(Side1==Side2 && Side2==Side3 && Side1==Side3){
            System.out.println("The Triangle is Equilateral");
        }

        else if(Side1==Side2 || Side2==Side3 || Side1==Side3){
            System.out.println("The Triangle is Isosceles");
        }
        else{
            System.out.println("The Triangle is scalene");
        }
     sc.close();
    }
}
