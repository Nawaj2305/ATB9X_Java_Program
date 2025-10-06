package Practice;

import java.util.Scanner;

public class Finding_Triangle_If_elseif {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the side 1=");
        int side1= sc.nextInt();

        System.out.println("enter the side 2=");
        int side2= sc.nextInt();

        System.out.println("enter the side 3=");
        int side3= sc.nextInt();

        if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("Please the valid size of sides");
        }
        else if (side1==side2 && side1==side3 && side2==side3 ) {
            System.out.println("This is Equilateral Triangle");
        }
        else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("This is Isosceles Triangle");
        }
        else {
            System.out.println("This is scalene Triangle");
        }
    }
}
