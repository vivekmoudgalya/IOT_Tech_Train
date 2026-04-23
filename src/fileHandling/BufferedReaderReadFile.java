package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderReadFile
{
    public static void main(String[] args) throws Exception{
        //can we create an object of a class inside constructor
        //classAName obj = new ClassName(new ClassBName());
        BufferedReader reader=new BufferedReader(new FileReader("./Demo/current_status.txt"));
        String str;
        while((str=reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();
    }
}
