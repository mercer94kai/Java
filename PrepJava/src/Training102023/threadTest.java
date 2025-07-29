package Training102023;

public class threadTest implements Runnable {

    public void run(){
        System.out.println("I am running thread");
    }

    public static void main(String[] args) {
        threadTest td= new threadTest();
        Thread obj=new Thread(td);
        obj.start();
    }
}
