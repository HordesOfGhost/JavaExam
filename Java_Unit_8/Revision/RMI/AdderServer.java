import java.rmi.*;
import java.rmi.registry.*;

public class AdderServer{
    public static void main(String[] args){
        try{
            AdderInterface obj = new AdderClass();
            
            Naming.rebind("Add",obj);
            System.out.println("Server Started");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}