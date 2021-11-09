package Thread;
import java.lang.Thread;

import java.util.ArrayList;

/**
 * @author BianWenKai
 * @DATE 2021/9/9 - 19:57
 **/
public class Main{

    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        Thread t1 = new Main().new MyThread();
        Thread t2 = new Thread(new Main().new MyRunnable());
        t1.setPriority(10);  //最大优先级
        t2.setPriority(2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        for (int i = 0; i < 100000; i++) {
            i++;
        }
        list.add("main");



        for (String s : list) {
            System.out.println(s);
        }
    }

    class MyThread extends Thread{
        @Override
        public void run(){
            for (int i = 0; i < 100000; i++) {
                i++;
            }
            list.add("Thread 1");
        }
    }

    class MyRunnable implements Runnable{
        @Override
        public void run(){
            for (int i = 0; i < 100000; i++) {
//                Thread.yield();
                i++;
            }
            list.add("Thread 2");
        }
    }
}

//public class Main {
//
//
//    private static int x = 10;
//    private static Integer y = 10;
//
//    public static void updateX(int value) {
//        value = 3 * value;
//    }
//
//    public static void updateY(Integer value) {
//        value = 3 * value;
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[-1];
//        updateX(x);
//        updateY(y);
//    }
//}