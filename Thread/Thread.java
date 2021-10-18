package Thread;

/**
 * @author BianWenKai
 * @DATE 2021/9/26 - 18:32
 **/
public class Thread implements Runnable {

    private Integer ticket = 10;

    @Override
    public void run() {
        while (true){
            if (ticket <= 0){
                break;
            }
            try {
                java.lang.Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(java.lang.Thread.currentThread().getName()+"拿到了第"+ticket--+"票");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        new java.lang.Thread(thread,"张三").start();
        new java.lang.Thread(thread,"李四").start();
        new java.lang.Thread(thread,"王五").start();

    }
}
