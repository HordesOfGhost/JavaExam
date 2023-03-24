import java.io.*;
public class FileOutput{
    public static void main(String[] args){
        try{
            FileOutputStream fo = new FileOutputStream("Hellos.txt");
            String s = "Bibek Sakila";
            byte b[] = s.getBytes();
            fo.write(b);
            fo.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}