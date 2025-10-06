package Task.Arrays;

import java.util.Arrays;

public class Array_max_easy {

    public static void main(String[] args) {
        int[] array={10,8,4,22,34,55,45};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
