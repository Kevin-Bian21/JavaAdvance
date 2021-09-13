package ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author BianWenKai
 * @DATE 2021/9/13 - 15:17
 **/
public class ExecutorDemo {

    public static void main(String[] args) {

        //创建含有3个线程的线程池：ThreadPoolExecutor
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            //向线程池提交任务，可以使其返回一个值，返回值类型为 V
            Future<Integer> variable = executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                LongTak.simulate();
                return 1;
            });
            //该条语句将会最先出现，因为submit()并不会为了完成LongTak.simulate()该方法任务而等待，而是他将在另外一个线程上去执行这个任务
            System.out.println("test");
            try {
                // get() 当前任务的结果要准备好，才能往下执行
                Integer result = variable.get();
                System.out.println(result);
            }catch (InterruptedException |  ExecutionException  e){
                e.printStackTrace();
            }


            //假设有10个任务，则我们只需要将这10个任务提交给线程池，由线程池来分配线程给具体任务。
            //提交的这10个任务将进入队列，然后等待线程分配
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println(Thread.currentThread().getName());
                });
            }
        }finally {
            //等任务全部执行完之后关闭线程池
            executor.shutdown();
        }

    }

}
