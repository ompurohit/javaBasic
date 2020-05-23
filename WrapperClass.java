public class WrapperClass{
    public static void main(String[] args){
        /**
            use pure opps 
            declare variabl using oops 
        */

        // Interger is class and .valueof is static member function to assign or create int value
        Integer i = Integer.valueOf("5");
        
        // assign binary value
        Integer j = Integer.valueOf("10101",2);

        Double D1 = Double.valueOf("15.02");

        // parseInt is instanse memeber function and return int value
        int a = Integer.parseInt("123");

        double d2 = Double.parseDouble("13.45");

        // i represent object and intvalue return value of i
        int c = i.intValue();

        System.out.println("static memeber function i = "+ i);
        System.out.println("static memeber function store binary value j = "+ j);
        System.out.println("static memeber function Double d1 = "+ D1);
        System.out.println("instance memeber function parseInt a = "+ a);
        System.out.println("instance memeber function parseDouble d2 = "+ d2);
        System.out.println("instance memeber function intvalue c = "+ c);

    }
}