package Stream;

import java.util.List;

/**
 * @author BianWenKai
 * @DATE 2021/11/30 - 17:51
 **/
public class Grade {
    private int id;
    private List<Person> persons;
    private String mark;

    public Grade(int id, List<Person> persons, String mark) {
        this.id = id;
        this.persons = persons;
        this.mark = mark;
    }

    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", persons=" + persons +
                ", mark='" + mark + '\'' +
                '}';
    }
}
