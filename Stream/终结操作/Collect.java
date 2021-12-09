package Stream.终结操作;

import Stream.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author BianWenKai
 * @DATE 2021/12/9 - 21:41
 **/
public class Collect {

    public static void main(String[] args) {

        Person p1 = new Person("Bob",22);
        Person p2 = new Person("Jack",13);
        Person p3 = new Person("Tom",18);
        Person p4 = new Person("Tom",20);
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3));

        //转化为List集合
        List<String> nameList =  persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        //转化为Set集合
        Set<String> nameSet =  persons.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());

        //转化为Map集合
        Map<String, Integer> nameMap = persons.stream()
                .collect(Collectors.toMap(new Function<Person, String>() {
                                              @Override
                                              public String apply(Person person) {
                                                  return person.getName();
                                              }
                                          },
                        new Function<Person, Integer>() {
                            @Override
                            public Integer apply(Person person) {
                                return person.getAge();
                            }
                        }));

        System.out.println(nameList);
        System.out.println(nameSet);
        System.out.println(nameMap);


    }

}
