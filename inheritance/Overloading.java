class Parent{
    public void fun1(int x){
        System.out.println("Parent class Function");
    }
}

class Child extends Parent{
    public void fun1(int x, int y){
        System.out.println("Child class Function");
    }

}

public class Overloading{
    public static void main(String []args){
        Child obj = new Child();
        obj.fun1(5);
        obj.fun1(5,6);
    }
}