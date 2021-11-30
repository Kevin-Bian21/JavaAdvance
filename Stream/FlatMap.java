package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 17:42
 **/
public class FlatMap {
    public static void main(String[] args) {
        Person p1 = new Person("Jone",15);
        Person p2 = new Person("Bob",22);
        List<Person> persons1 = new ArrayList<>(Arrays.asList(p1, p2));

        Person p3 = new Person("Jack",13);
        Person p4 = new Person("Tom",18);
        List<Person> persons2 = new ArrayList<>(Arrays.asList(p1, p2));


        Grade grade1 = new Grade(2018, persons1, "一年级");
        Grade grade2 = new Grade(2019, persons1, "二年级");
        List<Grade> grades = new ArrayList<>(Arrays.asList(grade1, grade2));

        //从年级中拿到学生名字
        grades.stream()
                .flatMap(new Function<Grade, Stream<Person>>() {
                    @Override
                    public Stream<Person> apply(Grade grade) {
                        return grade.getPersons().stream();
                    }
                })
                .forEach(new Consumer<Person>() {
                    @Override
                    public void accept(Person p) {
                        System.out.println(p.getName());
                    }
                });
    }
}
