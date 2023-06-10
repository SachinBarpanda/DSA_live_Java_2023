package Lec12;

public class Para_No_Return_Return {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int ans = add(a,b);
        System.out.println(ans);
    }
//    public static void add(int a , int b){
//        int c = a + b;
//        System.out.println(c);
//    }
    public static int add(int a1 , int b1){
        int c = a1+b1;
        return c ;
    }
}
