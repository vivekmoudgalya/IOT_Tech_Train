package fileHandling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        // . is the current directory
        // To enter the current dir - we use forward slash /
        // It deletes the last level Folder [Innermost]
        File folder = new File("./Demo/F1/F2/F3/F4");
        if (folder.delete()) {
            System.out.println("Folder " + folder.getName() + " Deleted");
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
