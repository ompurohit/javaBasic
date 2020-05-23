package pack1;
public class ImportExample{
    private int roll_no;
    private String name;

    public void setName(String st_name){
        name = st_name;
    }

    public void setRollNo(int number){
        roll_no = number;
    }

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return roll_no;
    }
}