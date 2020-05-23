class Example{
    int x; //Instanse variable
    private static int y = 4; // static member variable

    public void fun1(){
        System.out.println("instanse member function");
    }

    public static void fun2(int n){
        y = n;
        System.out.println("static member function");
        System.out.println("static member variable y = " + y);
    }

    public static int fun3(){
        return y;
    }

    // static inner class
    static class Test{

        public static int y = Example.fun3();
        public static String country = "India";

    }
}

class Hello{
    public static void  main(String[] args){
        Example obj1 = new Example();
        // calling member function
        obj1.fun1();

        // calling private static member variable
        // System.out.println("Calling private static memeber" + Example.y);

        // calling private static member variable through test class
        System.out.println("Calling private static memeber = " + Example.Test.y);

        // calling private static member function 
        System.out.println("Calling private static function = " + Example.fun3());

        // calling static member function
        Example.fun2(4);

        // calling inner static class 
        System.out.println("inner static class static memeber variable = " + Example.Test.country);
    }
}