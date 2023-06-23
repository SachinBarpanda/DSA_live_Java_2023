package Lec24;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(trapping(arr));
    }
    public static int trapping(int [] arr){
        int sum = 0;
        for (int i = 0, j = arr.length-1; i<j ;) {
            sum = Math.max(sum, (j-i)*(Math.min(arr[j],arr[i])));
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return sum;
    }

//    public static int trapping(int [] arr){
//        int[] left = new int[arr.length];
//        int[] right = new int[arr.length];
//        left[0] = arr[0];
//        int sum = 0;
//        right[arr.length-1] = arr[arr.length-1];
//        for (int i = 1; i < arr.length; i++) {
//            left[i] = Math.max(left[i-1],arr[i]);
//        }
//        for (int i = arr.length-2; i >=0  ; i--) {
//            right[i] = Math.max(right[i+1],arr[i]);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            sum+=Math.min(left[i] , right[i] )-arr[i];
//        }
//        return sum;
//    }
}
