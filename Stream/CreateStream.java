package Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 14:55
 **/
public class CreateStream {
    public static void main(String[] args) {
        //对于数组数组
        Integer[] array = {1,2,3,4,5,6};
        // 1.使用Arrays.stream(array);
        Stream<Integer> stream =  Arrays.stream(array);
        // 2.使用Stream.of(array)
        Stream<Integer> stream1 = Stream.of(array);


        Person p1 = new Person("Jone",18);
        Person p2 = new Person("Bob",22);

        //对于单列集合
        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2));
        Stream<Person> stream2 = people.stream();



        //双列集合:转化成单列集合后再创建
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Tom");
        map.put(2, "Jack");
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        Stream<Map.Entry<Integer,String>> stream3 = entrySet.stream();
        //也可一步到位
        //Stream<Map.Entry<Integer,String>> stream3 = map.entrySet().stream();
    }
}
