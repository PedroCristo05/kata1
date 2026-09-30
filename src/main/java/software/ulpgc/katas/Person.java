package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthDate) {

    public int calculateAge() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    public static final double DAYS_PER_YEAR = 365.25;

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
