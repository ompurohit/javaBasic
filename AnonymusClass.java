class Greeting{
    public void sayHello(){
        System.out.println("Hello Parent");
    }
}

class India{
    Greeting g = new Greeting(){
        public void sayHello(){
            System.out.println("Hello from child");
        }
        public void sayHi(){
            System.out.println("Hello from child");
        }
    };
}

public class AnonymusClass{
    public static void main(String []args){
        India india = new India();
        india.g.sayHello();
        // india.g.sayHi();
    }
}