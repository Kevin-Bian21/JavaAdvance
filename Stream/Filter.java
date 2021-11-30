package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 13:50
 **/
public class Filter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("car");
        list.add("can");
        list.add("care");

        System.out.println(list);

        List<String> array = new ArrayList<>();
        System.out.print("普通方式过滤元素: ");
        for (String s : list) {
            if (!s.equals("can"))
                array.add(s);
        }
        System.out.println(array);


        System.out.print("使用Steam流的方式过滤元素： ");
        List<String> result;
        result = list.stream().filter(name -> !"can".equals(name)).collect(Collectors.toList());
        System.out.println(result);


        List<Integer> ls = new ArrayList<>(Arrays.asList(1,2,8,9,2,3,4,8,9,0));
        //过滤掉 ls 集合中的奇数
        ls.stream()  //集合转化为流
            .filter(x -> x % 2 == 0)  //过滤掉奇数
            .distinct()  //去重
            .forEach(System.out::println);  //输出
    }
}
