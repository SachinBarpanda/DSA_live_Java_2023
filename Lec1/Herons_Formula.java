package Lec1;

import java.util.Scanner;

public class Herons_Formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s = (a+b+c)/2;

        int area = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}