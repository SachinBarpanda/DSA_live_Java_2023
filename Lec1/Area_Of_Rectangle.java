package Lec1;

import java.util.*;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int area_of_rectangle = length * breadth;

//        System.out.print("The area  is : " + area);//error
        System.out.print(area_of_rectangle);
    }
}
