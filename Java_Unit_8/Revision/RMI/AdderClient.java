import java.rmi.*;
import java.rmi.registry.*;

public class AdderClient{
    public static void main(String[] args){
        try{
            AdderInterface obj = (AdderInterface) Naming.lookup("Add");

            int res = obj.add(29,299);
            System.out.println("Result"+res);
        }catch(Exception e){

        }
    }
}