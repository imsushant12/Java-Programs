import java.io.*;

public class BufferWriterClassExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("temp.txt", true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello from Buffered Writer Class");
        bw.close();
    }
}
