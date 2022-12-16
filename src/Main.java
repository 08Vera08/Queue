import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Person> generateClients() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Pavel", "Kireev", 8));
        people.add(new Person("Vladimir", "Lenin", 8));
        people.add(new Person("Lionel", "Messi", 5));
        people.add(new Person("Nevskiy", "Alexander", 7));
        people.add(new Person("Petr", "First", 4));
        return people;
    }

    public static void main(String[] args) {
        ArrayDeque<Person> queue = new ArrayDeque<>();
        ArrayList<Person> list = (ArrayList<Person>) generateClients();
        for (int i = 0; i < 5; ++i) {
            ((Person) list.get(i)).show();
            queue.add(((Person) list.get(i)));
        }
        while (true) {
            Person person = queue.poll();
            if (person == null) {
                break;
            }
            System.out.println(person.getName() + ' ' + person.getLastName() + " прокатился на аттракционе.");
            person.decrease();
            if (person.getCount() > 0) {
                queue.add(person);
            }
        }
    }

}