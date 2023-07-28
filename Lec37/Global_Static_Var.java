package Lec37;

public class Global_Static_Var {
    static int var = 100;
    public static void main(String[] args) {
        System.out.println(var);
        globalDemo();
        System.out.println(var);
    }
    public static void globalDemo(){
        System.out.println("Hey");
        int var = 50;
        var = var - 5;
        Global_Static_Var.var = Global_Static_Var.var + 10;
        System.out.println(var);
    }
}
