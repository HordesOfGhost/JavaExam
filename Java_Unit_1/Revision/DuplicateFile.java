import java.io.*;

public class DuplicateFile{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("New.txt");
            FileWriter fo = new FileWriter("dest.txt");

            int i = 0;
            while ((i = fr.read()) != -1){
                fo.write((char)i);
                fo.write((char)i);
            }
            fr.close();
            fo.close();
        }catch(Exception e){
            
        }
    }
}