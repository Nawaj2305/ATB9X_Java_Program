package Task.Arrays;

public class Arrays_min_max {

    public static void main(String[] args) {
        int [] arr={5,9,3,2,4,1,8,7};
        int maximum= max_num(arr);
        System.out.printf("The maximum number is %d",maximum);
        int minimum= min_value(arr);
        System.out.printf("The minimum number is %d",minimum);


    }

    static int max_num(int[] arr){
        int max= arr[0];
        for(int i=0;i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static  int min_value (int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    }
}
