import java.io.*;
public class BufferReader{
    public static void main(String []args) throws IOException{

        BufferedReader bf = new BufferedReader(new FileReader("File1.txt"));
        char []s1 = new char[20];
        // 2 is index of array 
        // 15 is total character which getting by read function
        bf.read(s1,10,4);

        //use read one line function
        // String s1;
        // while((s1 = bf.readLine()) != null)
        System.out.println(s1);
        bf.close();
    }
}