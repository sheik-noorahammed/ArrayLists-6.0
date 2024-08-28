import java.util.ArrayList;
import java.util.ListIterator;

public class Dynamic{
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 35));
        personList.add(new Person("Diana", 28));
        ListIterator<Person> listIterator = personList.listIterator();
        while (listIterator.hasNext()) {
            Person person = listIterator.next();
            System.out.println(person);
        }
    }
}

