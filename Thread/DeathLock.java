package Thread;
import java.lang.Thread;
/**
 * @author BianWenKai
 * @DATE 2021/10/19 - 13:59
 **/
public class DeathLock {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Thread thread1 =new Thread(
                ()->{
                    synchronized (a) {
                        System.out.println(Thread.currentThread().getName()+" I get a ");
                        try {
                            //让线程休眠，确保第二个线程能拿到b资源
                            Thread.sleep(200);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+" I want to get b");
                        synchronized (b) {
                            System.out.println("I get b");
                        }
                    }
                }
        );

        Thread thread2 = new Thread(
            ()->{
                synchronized (b) {
                    System.out.println(Thread.currentThread().getName()+" I get b ");
                    try {
                        Thread.sleep(200);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" I want to get a");
                    synchronized (a) {
                        System.out.println("I get a");
                    }
                }
            }
        );

        thread1.start();
        thread2.start();
    }
}
