package Lec2;

import java.util.Scanner;

public class Print_sum_of_odd_number_upto_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        int sum = 0;
        while(i <= n){
            sum += i;
            i+=2;
        }
        System.out.println(sum);
    }
}
