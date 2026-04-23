package fileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadDataFrontFile
{
    public static void main(String[] args)throws Exception {
        File file=new File("./Demo/current_status.txt");
        Scanner reader=new Scanner(file);
        while(reader.hasNext())
        {
            String data=reader.nextLine();
            System.out.println(data);
        }
        reader.close();

    }
}
