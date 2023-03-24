
// import java.lang.*;

class First extends Thread{
    @Override
    public void run(){
        for ( int i = 0; i <10; i++){
            try{
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Second implements Runnable{
    @Override
    public void run(){
        for ( int i = 11; i <20; i++){
            try{
                System.out.println(i);
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class MultiThreading{
    public static void main(String[] args){
        First fn = new First();
        Thread t1 = new Thread(fn);
        t1.start();
        Second sn = new Second();
        Thread t2 = new Thread(sn);
        t2.start();
    }
}