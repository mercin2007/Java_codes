import java.io.*;

public class Down0 {
    static void main(String[] args) {
        try {
            File output = new File("output.txt");
            FileOutputStream fout = new FileOutputStream(output);

            String S = "Welcome to Java class";
            byte[] b = S.getBytes();

            fout.write(b);
            fout.close();

            System.out.println("Writing successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}