import java.io.*;

public class FileClassExample {
    public static void main(String[] args) throws IOException {
        File f1 = new File("../Java/temp.txt");

        if (f1.exists())
            System.out.println("File exists.");
        else
            System.out.println("File does not exist.");

        // Creating the file
        if (f1.createNewFile())
            System.out.println("File created!");

        if (f1.exists())
            System.out.println("File exists.");
        else
            System.out.println("File does not exists");
        System.out.println("File Writing Permission : " + f1.canWrite());
        System.out.println("File Reading Permission : " + f1.canWrite());
        System.out.println("File Execution Permission : " + f1.canWrite());
        System.out.println("Name of File : " + f1.getName());
        System.out.println("Length of File : " + f1.length());

        if (f1.delete())
            System.out.println("File deleted!");

    }

}
