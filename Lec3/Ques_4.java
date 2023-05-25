package Lec3;

import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRow = sc.nextInt();
        int currRow = 1;
        int space = totalRow-1;
        int stars = 1;
        while(currRow <= totalRow) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= stars) {
                System.out.print("* ");
                j++;
            }

            space--;
            currRow++;
            stars++;
            System.out.println();
        }
    }
}
