// import java.util.Scanner;

public class ClassEx{
    int length,breadth;
    ClassEx(int ln,int br){
        length = ln;
        breadth = br;
    }

    void displayArea(){
        System.out.println("Area : " + (length * breadth));
    }
    public static void main(String[] args){
        ClassEx obj = new ClassEx(45,34);
        obj.displayArea();

        // ClassEx obj1 = new ClassEx();
    }
}