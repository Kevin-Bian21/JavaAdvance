package Lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntConsumer;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 10:51
 **/
public class LambdaDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println("普通遍历");
        for (Integer key : map.keySet()) {
            System.out.println("k = " + key + "  |   v = " + map.get(key));
        }

        System.out.println("使用Lambda表达式遍历");
        map.forEach((k, v) -> System.out.println("k = " + k + "  |   v = " + v));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //普通遍历方式
        for (int value : list)
            System.out.print(value + " ");

        System.out.println();
        //使用Lambda遍历
        list.forEach( i ->
            System.out.print(i + " ")
        );
        //使用双冒号运算符遍历
        list.forEach(System.out::print);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Lambda表达式方法实现");
            }
        });

        Thread thread1 = new Thread(() -> System.out.println("匿名内部内不同实现方式"));

        System.out.println();
        int num = typeConversion( s -> (int) s.charAt(0));

        System.out.println(num);

        int[] arr = {1, 3, 5, 7};
        foreachArr(System.out::println,arr);
    }

    public static <E> E typeConversion(Function<String, E> function) {
        String string = "Hello, Wold!";
        return function.apply(string);
    }

    public static void foreachArr(IntConsumer consumer, int[] arr) {
        for (int i : arr)
            consumer.accept(i);
    }
}
