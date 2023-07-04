package Lec29;

public class String_Intro2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

//        String s3 = "Hello";
//        String s4 = "Hello";
        String s3 = new String("Hello");
        String s5 = new String("Bye");
//        String s4 = s5+s3;
        String s4 = "Hello"+"Bye";
        System.out.println(s4 == "HelloBye");
//        String s4 = new String("Hello");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s3==s4);
//        System.out.println(s1==s2);
//        String s5 = s1 + s2;
//        String s6 = s3 + s4;
//        System.out.println(s5 == s6);

    }
}
