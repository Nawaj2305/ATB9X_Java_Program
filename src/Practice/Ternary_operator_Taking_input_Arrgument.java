package Practice;

public class Ternary_operator_Taking_input_Arrgument {

    public static void main(String[] args){

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c= Integer.parseInt(args[2]);

       String max= (a>b && a>c)? "args[0]": (b>c)? "args[1]":"args[2]";
        System.out.println(max);
    }
}
