package pack2;
import pack1.ImportExample;
public class UseImport{
    public static void main(String[] args){
        ImportExample obj = new ImportExample();
        obj.setRollNo(151);
        obj.setName("Om Prakash");
        System.out.println("Student Roll No. = "+ obj.getRollNo());
        System.out.println("Student name = "+ obj.getName());
    }

}