package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        // File extension is needed, or else junk file will
        // be created
        File file = new File("./Demo/ise.text");
        if (file.createNewFile()) {
            System.out.println("File: "+file.getName()+ " is created.");
        } else {
            System.out.println("Failed to create the file.");
        }
    }
}
