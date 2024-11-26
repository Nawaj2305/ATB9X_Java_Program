package Task.Task_22102024_While_Loop;

public class Task_While_args {

    // while loop taking inputs from argument
    public static void main(String[] args) {
        String age= args[0];

        // String -> integer

        int a=Integer.parseInt(age);

        while(a > 0){
            System.out.println(a);
            a--;
        }


    }
}
