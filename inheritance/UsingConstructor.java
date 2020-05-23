class Parent{
    public Parent(){
        System.out.println("Hello this is parent constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Hello this is Child constructor");
    }

    public void fun1(){
        System.out.println("this is child function");
    }
}
public class UsingConstructor{
    public static void main(String []args){
        Child obj = new Child();
        // System.out.println(obj.fun1());
    }
}