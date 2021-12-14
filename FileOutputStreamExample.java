import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        // FileOutputStream fout = new FileOutputStream("../Java/temp.txt", true);

        File f1 = new File("../Java/temp.txt");
        FileOutputStream fout = new FileOutputStream(f1);

        String s = "Hello World!!";

        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
            fout.write(ch[i]);

        fout.close();
    }
}
