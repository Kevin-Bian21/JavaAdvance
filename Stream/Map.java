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

        //打印所有人的姓名
        persons.stream()
                .map(new Function<Person, String>() {
                    @Override
                    public String apply(Person person) {
                        return person.getName();
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });
    }
}
