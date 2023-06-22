package Lec4.Arrays;

import java.util.*;

public class pair_of_roses {
    public static void main(String[] args) {
//        pairRoses();
//        shoppingAlex();
//        Maximum_Sum_Path_in_Two_Arrays();
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapping(arr));
    }
    public static int trapping(int [] arr ){
        int [] left = new int[arr.length];
        int [] right = new int[arr.length];

        left[0] = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=(Math.min(left[i],right[i])-arr[i]);
        }
        return sum;

    }
    public static int Maximum_Subarray(int [] nums){
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            ans = sum;
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }

    public static void Maximum_Sum_Path_in_Two_Arrays(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [] arr1 = new int[n];
            int [] arr2 = new int[m];
            for(int i = 0 ; i < n ; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i = 0 ; i < m ; i++){
                arr2[i] = sc.nextInt();
            }
            int i = 0;
            int j = 0;
            int sum1 = 0;
            int sum2 = 0;
            while(i<arr1.length && j < arr2.length){
                if(arr1[i] == arr2[j]){
                    sum1 = Math.max(sum1,sum2);
                    sum1+=arr1[i];
                    sum2 = sum1;
                    i++;j++;
                }else if(arr1[i]<arr2[j]){
                    sum1+=arr1[i];
                    i++;
                }else{
                    sum2+=arr2[j];
                    j++;
                }
            }

            while(i < arr1.length){
                sum1+=arr1[i];
                i++;
            }

            while(j < arr2.length){
                sum2+=arr2[j];
                j++;
            }
            sum1 = Math.max(sum1,sum2);
            System.out.println(sum1);
        }

    }

    public static void pairRoses(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            int sum = sc.nextInt();
            Arrays.sort(arr);
            int rose1 = 0;
            int rose2 = 0;
            for (int i = 0; i < n ; i++) {
                for (int j = n-1; j > i; j--) {
                    if(sum==(arr[i]+arr[j])){
                        rose1 = arr[i];
                        rose2 = arr[j];
                    }
                }
            }
            System.out.printf("Deepak should buy roses whose prices are %d and %d.\n",rose1,rose2);
        }
    }
    public static void shoppingAlex(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        while(t-->0){
            int money = sc.nextInt();
            int itemsCanBuy = sc.nextInt();

            int count = 0;
            for (int i = 0; i < n; i++) {
                if(money%items[i]==0){
                    count++;
                }
            }
            if(count >= itemsCanBuy){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
