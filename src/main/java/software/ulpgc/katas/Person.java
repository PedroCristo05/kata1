package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    private final String name;

    private final LocalDate birthDate;
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    public static final double DAYS_PER_YEAR = 365.25;

    private int toYears(long days) {
        return (int) (days/ DAYS_PER_YEAR);
    }
}
