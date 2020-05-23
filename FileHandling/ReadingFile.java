import java.io.*;
public class ReadingFile{
    public static void main(String []args) throws IOException{
        int i;
        FileInputStream fileInput = new FileInputStream("./myFile.txt");
        do{
            i = fileInput.read();
            System.out.print((char)i);
        }while(i != -1);
        fileInput.close();
    }
}