import java.security.spec.ECFieldF2m;

class Resourse{
    public synchronized void printTable(int n){
        for (int i = 1; i <=10; i++){
            try{
                System.out.println(i + " * " + n + " = " +  (i * n ));
                Thread.sleep(500);
            }catch(Exception e ){
                System.out.println(e);
            }
        }
    }
}

class Table2 extends Thread{
    Resourse r;
    Table2(Resourse r){
        this.r = r;
    }
    
    public void run(){
        r.printTable(2);
    }
}


class Table5 extends Thread{
    Resourse r;
    Table5(Resourse r){
        this.r = r;
    }
    
    public void run(){
        r.printTable(5);
    }
}
public class SyncronizedEx{
    public static void main(String[] args){
        Resourse r = new Resourse();

        Table2 t2 = new Table2(r);
        Table5 t5 = new Table5(r);

        t2.start();
        t5.start();

    }   
}