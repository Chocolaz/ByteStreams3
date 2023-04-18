package bytestreams3;

import java.io.*;

public class LAB3 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileInputStream file = null;
        try {
            file = new FileInputStream("data.dat");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        DataInputStream input = new DataInputStream(file);
        try {
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}