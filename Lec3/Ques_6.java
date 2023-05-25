package Lec3;

import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int spaces = 0;
        while(row <= n){
            int i = 1 ;
            while(i <= spaces ){
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }

            spaces+=2;
            star--;
            row++;
            System.out.println();
        }
    }
}
