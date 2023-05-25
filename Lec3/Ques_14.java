package Lec3;

import java.util.*;

public class Ques_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRow = sc.nextInt();
        int currRow = 1;
        int space = totalRow-1;
        int stars = 1;
        while(currRow <= 2*totalRow-1) {
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

            if(currRow>=totalRow){
                space++;
                stars--;
            }else{
                space--;
                stars++;
            }

            currRow++;
            System.out.println();
        }
    }
}
