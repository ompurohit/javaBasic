final class Parent{ // now can't use class functionality as chlid
    private int x;
    public void fun1(int val){ // instance member function you can overridden using child
        x = val;
        int y; //local memeber variable
        final int y; // local final member variable
    }

    public final void fun2(int val){ // instance final member function you cann't overridden using child
        x = val;
    }

    
}
class child extends Parent{

}

public class FinalKeyword{ 
    private int x; // instanse member variable it's value is 0

    /**
        We can't change final variable value multiple times
        here we can initilize final variable such as:
        1) private final int x = 5;
        2) using initialization box
            {
                x=5;
            }
        3) or using constructor
     */
    private final int y; // final instanse memeber variable like javascript const and its value is blank

    private static int a; // static member variable it's initilize value is 0

    /**
        we can initilize static final variable such as:
        1) private static final int b = 5;
        2) using static initiliazation box
        static
        {
            b = 5;
        }
     */
    private static final int b; // static final member variable and also  it's initilize value is blank

}