package Practice;

public class Function_Practice {

    public static void main(String[] args){

        int a=sum(10,12);
        System.out.println("The addition is = "+a);
        int s=sub(10,2);
        System.out.println("The substaction is = "+s);
        int m=mul(10,10);
        System.out.println("The Multiplication is = "+m);
        int d=div(25,5);
        System.out.println("The Division is = "+d);
    }

    private static int sum(int a,int b){
        return a+b;
    }

    private static int sub(int a, int b){
        return a-b;
    }

    private static int mul(int a,int b){
        return a*b;
    }

    private static int div(int a, int b){
        return a/b;
    }
}
