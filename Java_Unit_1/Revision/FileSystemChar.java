import java.io.*;

public class FileSystemChar {
    public static void main(String[] args){

        try{
            FileReader fr = new FileReader("New.txt");
            int i = 0;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
            fr.close();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            FileWriter fo = new FileWriter("New.txt");
            String name = "Bibek";
            fo.write(name);
            fo.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}
