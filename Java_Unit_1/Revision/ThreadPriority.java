class First extends Thread{
    public void run(){
        System.out.println("First");
    }
}

class Second extends Thread{
    public void run(){
        System.out.println("Second");
    }
}
class Third extends Thread{
    public void run(){
        System.out.println("Third");
    }
}

public class ThreadPriority{
    public static void main(String[] args){
        First fr = new First();
        Second sc = new Second();
        Third tr = new Third();

        Thread t1 = new Thread(fr);
        Thread t2 = new Thread(sc);
        Thread t3 = new Thread(tr);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}