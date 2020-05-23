import java.io.*;
public class WritingFile{
    public static void main(String []args) throws IOException{
        int i;
        FileOutputStream fOut = new FileOutputStream("./myFile.txt",true);
        String data = "TATA";
        char ch[] = data.toCharArray();
        for (i=0; i<data.length(); i++){
            fOut.write(ch[i]);
        }
        fOut.close();
    }
}