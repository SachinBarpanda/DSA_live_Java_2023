package Lec35;

public class factorial_tail {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n,1));
    }
    public static int factorial(int n , int a ){

        if(n==0){
            return a;
        }

        return factorial(n-1, a*n);
    }
}
