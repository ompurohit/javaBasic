public class Example{
    public static void main(String []args){
        Student obj = new Student();
        obj.setRollNo(22);
        obj.setName("Rohan");
        obj.setAge(20);
        System.out.println("Student Name: " + obj.getName());
        System.out.println("Student Age: " + obj.getAge());
        System.out.println("Student Roll no: " + obj.getRollNo());
    }
}