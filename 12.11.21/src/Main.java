import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Task1();
        Thread thread2 = new Task2();
        thread1.start();
        thread2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run(){
        for (int i =0; i<50;i++){
            System.out.println("Курица");
        }
    }
}

class Task2 extends Thread{
    @Override
    public void run(){
        for (int i =0; i<50;i++){
            System.out.println("Яйцо");
        }
    }
}
