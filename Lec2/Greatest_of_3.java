package Lec2;

import java.util.Scanner;

public class Greatest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        main part जरूरी भागा

//        wrong way

//        if(a>b){
//            if(a>c){
//                System.out.println(a);
//            }
//        }else if(b>a){
//            if(b>c){
//                System.out.println(b);
//            }
//        }else{
//            if(c > b){
//                System.out.println(c);
//            }
//        }

//        right way

        if(a>b && a>c){
            System.out.println(a);
        }else if(b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }

    }
}
