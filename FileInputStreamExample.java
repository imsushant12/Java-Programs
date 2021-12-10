import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("../Java/temp.txt");
        int i = 0;

        do {
            i = fis.read();
            if (i != -1)
                System.out.print((char) i);
        } while (i != -1);

        fis.close();
    }
}
