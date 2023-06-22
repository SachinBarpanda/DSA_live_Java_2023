package Lec4.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,2,1,1,0,0};
        Display(arr);
//        bubbleSort(arr);
//        SelectionSort(arr);
        dnf(arr);
        Display(arr);



    }

    public static void bubbleSort(int[] arr) {
        for (int loop1 = 0; loop1 < arr.length - 1; loop1++) {
            for (int i = 0; i < arr.length - loop1 - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }
    public static void dnf(int[] arr){
        int i = 0 ;
        int j = 0;
        int k = arr.length-1;
        while(i<=k){
            if(arr[i] == 2){
                swap(arr,i,k);
                k--;
            } else if (arr[i] == 1) {
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
    }

    public static void SelectionSort(int[] arr) {
        for (int item = 0; item < arr.length - 1; item++) {
            int minEleIdx = item;
            for (int i = item + 1; i < arr.length; i++) {
                if (arr[minEleIdx] > arr[i]) {
                    minEleIdx = i;
                }
            }
            swap(arr, minEleIdx, item);
        }
    }
    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
