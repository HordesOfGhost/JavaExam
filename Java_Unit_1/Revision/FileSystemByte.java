import java.io.*;
import java.util.*;

public class FileSystemByte{
    public static void main(String[] args){
        try{
            FileInputStream fi = new FileInputStream("Hellos.txt");
            int i = 0;
            while((i = fi.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            File f = new File("New.txt");
            FileOutputStream fo = new FileOutputStream(f,true);

            String text;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text");
            text = sc.nextLine();
            byte[] byt = text.getBytes();

            fo.write(byt);
            fo.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}