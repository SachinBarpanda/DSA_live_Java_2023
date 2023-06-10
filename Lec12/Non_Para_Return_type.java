package Lec12;

public class Non_Para_Return_type {

    public static void main(String[] args) {
        int a = 9;
        int b = 21;
        int c = a + b;
        System.out.println(c);
        int a1 = add();
        System.out.println(a1);
    }

    public static int add() {
        int a = 12;
        int b = 28;
        int c = a + b;
//        System.out.println(c);
        return c;
    }
}


