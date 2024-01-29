package FloChecker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FloChecker {
    public String checkMenstrualCircle(String startOfMenstrualCircle, int averageCycleLength) {
        LocalDate dateOfMenstrualCircleStart = LocalDate.now();
        try {
            dateOfMenstrualCircleStart = LocalDate.parse(startOfMenstrualCircle);
        } catch (Exception error) {
            System.out.println("Error, Date not in the correct format(YYYY-MM-DD)");
        }
        System.out.printf("Menstruation starts on %s and it ends on %s%n", DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart), DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength)));
        System.out.printf("Fertile window is from on %s to %s%n", DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength-17)), DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength-12)));
        System.out.printf("Ovulation occurs on %s and ends 12 to 24 hours after.", DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength-14)));
        return String.format("Menstruation starts on %s and it ends on %s, Fertile window is from %s to %s, Ovulation occurs on %s and ends 12 to 24 hours after.", DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart), DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength)), DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength-17)), DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength-12)), DateTimeFormatter.ofPattern("MMM d, uuuu").format(dateOfMenstrualCircleStart.plusDays(averageCycleLength-14)));

    }
}
