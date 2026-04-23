package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedReaderWriteData
{
    public static void main(String[] args) throws Exception {
        String[] names={"Nirmal","Anup","Raushan"};
        BufferedWriter writer=new BufferedWriter(new FileWriter("./Demo/demo.txt",true));
        writer.write("\nWriting line 2  to the file.");
        writer.close();
    }
}
