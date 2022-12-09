public class TablesThread extends Thread{
    public void run(){
        int number=5;
        try{
            for(int i=1;i<=10;i++){
                System.out.printf("%d * %d = %d \n",number,i,number * i);
                Thread.sleep(500);}
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("first thread is completed");
    }
    public void run(int a) {
        int number = 8;
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d \n", number, i, number * i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        Thread t=new Thread();
        Thread t1=new Thread();
        TablesThread t2=new TablesThread();
        t.start();
        t1.start();
        t2.run();
        t2.run(10);
    }

}

