import java.io.FileOutputStream;
import java.io.*;

class Employee implements Serializable{
    String name;
    int age;
    String department;

    public Employee (String name,int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
public class SerDeser{
    public static void main(String[] args){
        Employee emp1 = new Employee("Sakku",11,"UI/UX");
        Employee emp2 = new Employee("Bibek",29,"AI");
    
    try{
        FileOutputStream fo = new FileOutputStream("Emp.doc");
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(emp1);
        out.writeObject(emp2);
        out.close();
        FileInputStream fi = new FileInputStream("Emp.doc");
        ObjectInputStream in = new ObjectInputStream(fi);
        Employee e = (Employee)in.readObject();
        System.out.println(e.name);
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}