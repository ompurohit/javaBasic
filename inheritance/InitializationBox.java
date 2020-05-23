public class InitializationBox{
    private int x;

    private static int y;

    // instance initializtion box
    {
        System.out.println("InitializationBox block: x =" + x);
        x = 5;
    }

    // static initialization box
    static
    {
        System.out.println("static initialization block: y =" + y);
        y = 15;
    }

    public InitializationBox(){
        System.out.println("Constructor: x =" + x);
    }

    public static void main(String []args){
        InitializationBox t1 = new InitializationBox();
        InitializationBox t2 = new InitializationBox();
    }
}