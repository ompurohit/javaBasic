public class GenericFunction{
    public <E> void printArray(E []s){
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
    public static void main(String []args){
        GenericFunction obj = new GenericFunction();
        String countries[] = new String[]{"India","Japan","America","Austrelia"};
        Integer numbers[] = {12,13,15};
        obj.printArray(countries);
        obj.printArray(numbers);
    }
}