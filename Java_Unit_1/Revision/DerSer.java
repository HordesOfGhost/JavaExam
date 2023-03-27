import java.io.*;

class Employee implements Serializable{
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class DerSer{
    public static void main(String[] args){
        try{
            FileOutputStream fo = new FileOutputStream("obj.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            Employee emp = new Employee(0, "Bibek");
            Employee emp2 = new Employee(1, "Sakila");

            oos.writeObject(emp);
            oos.writeObject(emp2);

            FileInputStream fi = new FileInputStream("obj.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            Employee ed = (Employee) ois.readObject();
            System.out.println(ed.name);

        }catch(Exception e){
            
        }
    }
}