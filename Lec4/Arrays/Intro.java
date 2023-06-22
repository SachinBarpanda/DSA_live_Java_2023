package Lec4.Arrays;

public class Intro {
    public static void main(String[] args) {
        int[] arr = new int [5];
        System.out.println(arr);

        int[] arr1 =new int[] {1,2,3,4,5,6,7};
        int[] other1 =new int[] {10,22,33,40,50,60,70};
        System.out.println(arr1[0] + " " + other1[0]);
        swap(arr1,other1);
        System.out.println(arr1[0] + " " + other1[0]);

    }
    public static void swap(int[] arr1 , int[] other1){
        int[] temp = arr1;
        arr1 = other1;
        other1 = temp;
        System.out.println(arr1);
        System.out.println(other1);
    }



    public static void swap(int a , int b ){
        int temp = a ;
        a = b;
        b = temp;
    }


}
