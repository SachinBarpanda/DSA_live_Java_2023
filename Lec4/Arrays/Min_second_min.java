package Lec4.Arrays;

public class Min_second_min {
    public static void main(String[] args) {
        int [] arr = {2,3,1,-15,-2,-7,-9};
        System.out.println(min(arr));
        System.out.println(secondMin(arr));
    }
    public static int min(int[] arr ){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static int secondMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                secondMin = min;
                min = arr[i];
            }
//            else if(secondMin > arr[i]){
//                secondMin = arr[i];
//            }
        }
        return secondMin;
    }
}
