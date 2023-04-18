package bytestreams3;

import java.io.*;

public class LAB4 {
    public LAB4() {
    }

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            String s = "Hello World!";
            byte[] b = s.getBytes();
            output.write(b);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
            int ch;
            while ((ch=input.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
