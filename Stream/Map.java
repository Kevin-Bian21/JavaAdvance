package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 15:38
 **/

// 对流中的元素进行计算或数据类型的转换
public class Map {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Jone",18),new Person("Bob",22)));

        //将person对象映射为person对象的姓名
        persons.stream()
                .map(Person::getName)
                .forEach(System.out::println);


        persons.stream()
                .map(Person::getAge)
                .map(age -> age + 10)
                .forEach(System.out::println);
    }
}
