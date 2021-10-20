package LockPratice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author BianWenKai
 * @DATE 2021/10/20 - 12:06
 **/

/*
synchronized的缺陷
获取锁的线程执行完了该代码块，然后线程释放对锁的占有；
线程执行发生异常，此时JVM(java虚拟机)会让线程自动释放锁。
如果这个获取锁的线程由于要等待IO或者其他原因（比如调用sleep方法）被阻塞了，但是又没有释放锁，那么其他线程也就只能一直无期限地等待下去，这多么影响程序的执行效率.
 */
public class DeathLockDemo {
    public static void main(String[] args) {

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        Thread thread1 = new Thread(
                ()->{

                    lock1.lock();
                    try {
                        System.out.println(Thread.currentThread().getName()+": I get a");
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        //线程1不释放锁1
//                        lock1.unlock();
                    }
                    System.out.println(Thread.currentThread().getName()+": I want get b");
                    //线程1需要获取锁2，但锁2未被线程2释放
                    lock2.lock();
                    try {
                        System.out.println(Thread.currentThread().getName()+": I get b");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        lock2.unlock();
                    }
                }
        );
        Thread thread2 = new Thread(
                ()->{
                    lock2.lock();
                    try {
                        System.out.println(Thread.currentThread().getName()+": I get b");
                        Thread.sleep(200);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        //线程2不释放锁2
//                        lock2.unlock();
                    }
                    System.out.println(Thread.currentThread().getName()+": I want get a");
                    //线程2需要获取锁1，但是锁1没有被线程1释放
                    lock1.lock();
                    try {
                        System.out.println(Thread.currentThread().getName()+": I get a");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        lock1.unlock();
                    }
                }
        );

        thread1.start();
        thread2.start();
    }
}
