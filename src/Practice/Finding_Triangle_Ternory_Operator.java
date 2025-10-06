package Practice;

public class Finding_Triangle_Ternory_Operator {

    public static void main(String[] args) {

        int side1=10;
        int side2=10;
        int side3=10;

        String result= (side1==side2 && side1==side3 && side2==side3)? "Equilateral triangle":
                (side1==side2 || side1==side3 || side2==side3)? "Isocelese Triangle": "Scalene triangle";

        System.out.println(result);
    }


}
