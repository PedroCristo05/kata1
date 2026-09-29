package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    private static final double DAYS_PER_YEAR = 365.25;
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
