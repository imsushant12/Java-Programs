import java.io.*;

public class BufferReaderClassExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("temp.txt");

        BufferedReader br = new BufferedReader(fr);

        int i = 0;

        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }

        br.close();
    }
}