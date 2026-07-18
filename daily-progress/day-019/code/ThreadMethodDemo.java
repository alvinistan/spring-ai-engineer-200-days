package code;

public class ThreadMethodDemo {
    static void main(String[] args) {
       try{
           Thread thread = new Thread(() -> {
               System.out.println(Thread.currentThread().getName());
           });

           thread.setName("Worker-1");
           thread.sleep(5000);
           thread.start();

       } catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
