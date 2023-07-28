package Lec38;

public class Dice_Roll_Sum {
    public static void main(String[] args) {
        int face = 3;
        int sum = 4;
        possibleWay(0,sum,"");
    }
    public static void possibleWay(int count , int sum , String ans){

        if(count == sum){
            System.out.println(ans);
            return;
        }

        if(count > sum){
            return;
        }

        possibleWay(count+1,sum,ans+1);//string + int = string
        possibleWay(count+2,sum,ans+2);//string + int = string
        possibleWay(count+3,sum,ans+3);//string + int = string

    }
}
