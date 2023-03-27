class First extends Thread{
    public void run(){
        for (int i = 0; i <= 10; i++){
            try{
                System.out.println(i);
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Second implements Runnable{
    @Override
    public void run(){
        for(int j = 11; j <= 20; j++){
            try{
                System.out.println(j);
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadEx{
    public static void main(String[] args){
        First f1 = new First();
        Second s2 = new Second();

        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(s2);

        t1.start();
        t2.start();
    }
}