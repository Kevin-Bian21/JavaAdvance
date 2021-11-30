package Stream;

import NowCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 16:24
 **/
public class Distinct {
    public static void main(String[] args) {
        Person p1 = new Person("Jone",18);
        Person p2 = new Person("Bob",22);
        Person p3 = new Person("Bob",22);
        Person p4 = new Person("Tom",18);
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        //根据姓名去重
        persons.stream()
                .map(Person::getName)
                .distinct()
                .forEach(System.out::println);

        //根据年龄去重
        persons.stream()
                .map(Person::getAge)
                .distinct()
                .forEach(System.out::println);


        Integer[] array = {1, 1, 2, 3, 3, 4, 5, 6};
        Stream.of(array)
                .distinct()
                .forEach(System.out::print);
    }
}
