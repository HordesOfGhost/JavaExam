import java.io.*;
public class RandomDemo{
    public static void main(String[] args){
        int a = 123;
        long b = 4335332;
        String s = "Here is some text";
        try{
            RandomAccessFile raf = new RandomAccessFile("C://Users//Ghost//Desktop//Java Programs//files//Hello.txt","rw");
            raf.writeInt(a);
            raf.writeLong(b);
            raf.writeUTF(s);
            raf.seek(0);
            raf.writeUTF(s);
            // raf.seek(0);
            System.out.println(raf.read());
            raf.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}