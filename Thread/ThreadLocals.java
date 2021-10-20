package Thread;
import java.lang.ThreadLocal;
import java.lang.Thread;
/**
 * @author BianWenKai
 * @DATE 2021/10/19 - 13:11
 **/
public class ThreadLocals {
    static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(
                ()->{
                    System.out.println(threadLocal.get()); //null
                    threadLocal.set(1);
                    threadLocal.set(2);
                    System.out.println(threadLocal.get()); //2
                }
        );

        Thread t2 = new Thread(
                ()->{
                    System.out.println(threadLocal.get()); //null
                    threadLocal.set(4);
                    threadLocal.set(5);
                    System.out.println(threadLocal.get()); //5
                    threadLocal.remove();
                    System.out.println(threadLocal.get()); //null
                }
        );

        t1.start();
        t1.join();
        t2.start();
    }
}
