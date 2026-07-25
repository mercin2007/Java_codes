import java.io.*;
import java.util.stream.Stream;

public class Hello1 {
    static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("output.txt");
            String s = "welcome to java class";
            byte[] bytes = s.getBytes();
            fout.write(bytes);
            fout.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
