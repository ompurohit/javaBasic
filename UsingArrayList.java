import java.util.*;
public class UsingArrayList{
    public static void main(String []args){
        ArrayList list = new ArrayList(2);
        list.add("Ajay");
        list.add("Rajesh");
        list.add("Ramesh");
        list.add(1,"Rakesh");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}