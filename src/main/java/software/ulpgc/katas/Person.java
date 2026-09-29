package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthDate) {
    private static final double DAYS_PER_YEAR = 365.25;

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
