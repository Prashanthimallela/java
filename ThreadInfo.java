public class ThreadInfo {

        public static void main(String... args){
        Thread t = Thread.currentThread();

        System.out.println("Current thread is "+t);

        t.setName("demo thread");

        System.out.println("New Name of the thread is: "+t);

        try{

        Thread.sleep(5000);

        }

        catch (InterruptedException e){

        e.printStackTrace();

        }

        System.out.println("Thread is exiting...");

        }

        }