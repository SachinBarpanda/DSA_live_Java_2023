package Lec1;

import java.awt.*;
import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        int simpleInterest = principle * rate * time / 100;

        System.out.println(simpleInterest);
    }
}
