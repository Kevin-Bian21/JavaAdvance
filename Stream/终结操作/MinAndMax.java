package Stream.终结操作;

import Stream.Person;

import java.util.*;

/**
 * @author BianWenKai
 * @DATE 2021/12/9 - 21:23
 **/
public class MinAndMax {

    public static void main(String[] args) {
        Person p1 = new Person("Jone",15);
        Person p2 = new Person("Bob",22);
        Person p3 = new Person("Jack",13);
        Person p4 = new Person("Tom",18);
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        Optional<Integer> minAge = persons.stream()
                .map(Person::getAge)
                .min( (x, y) -> x - y);

        Optional<Integer> maxAge = persons.stream()
                .map(Person::getAge)
                .max(Comparator.comparingInt(x -> x));
        System.out.println(minAge.get());
        System.out.println(maxAge.get());
    }

}
