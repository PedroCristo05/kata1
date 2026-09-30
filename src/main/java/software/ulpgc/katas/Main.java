package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {

    static void main() {
        Person person = new Person("Peter", LocalDate.of(2005, 7, 14));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}
