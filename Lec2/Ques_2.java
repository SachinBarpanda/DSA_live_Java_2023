package Lec2;

import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRow = sc.nextInt();
        int currRow = 1;
        int stars = 1;
        while(currRow <= totalRow){
            int i = 1;

            while(i<=stars){
                System.out.print("* ");
                i++;
            }

            currRow++;
            stars++;
            System.out.println();
        }
    }
}
