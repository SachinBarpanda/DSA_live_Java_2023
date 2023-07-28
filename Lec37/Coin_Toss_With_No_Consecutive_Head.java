package Lec37;

public class Coin_Toss_With_No_Consecutive_Head {
    public static void main(String[] args) {
        int n = 3;
        coinToss1Head(n,"");
    }
    public static void coinToss1Head(int tossLeft , String ans){

        if(tossLeft==0){
            System.out.println(ans);
            return ;
        }

        if(ans.length() == 0 || ans.charAt(ans.length()-1)!='H') {
            coinToss1Head(tossLeft - 1, ans + "H");
        }
        coinToss1Head(tossLeft-1,ans+"T");

    }
}
