package Task.Arrays;

public class Array_P2 {

    public static void main(String[] args) {
        int[] array=new int[5];
        System.out.println(array.length);
        array[0]=10;
        array[1]=12;
        array[2]=14;
        array[3]=16;
        array[4]=18;
        array[5]=20;

        try {
            System.out.println(array[5]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

    }
}
