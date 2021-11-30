package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 17:25
 **/
public class Limit {
    public static void main(String[] args) {
        Person p1 = new Person("Jone",15);
        Person p2 = new Person("Bob",22);
        Person p3 = new Person("Jack",13);
        Person p4 = new Person("Tom",18);
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        persons.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .limit(3)
                .forEach(x -> System.out.println(x.getName()));
    }
}
