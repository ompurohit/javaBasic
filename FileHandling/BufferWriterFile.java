import java.io.*;
public class BufferWriterFile{
    public static void main(String []args) throws IOException{
        FileWriter fw = new FileWriter("./myFile.txt",true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("computer");
        bf.close();
    }
}