package FloChecker;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FloCheckerTest {
    @Test
    public void testMenstrualDate(){
        FloChecker myFloChecker = new FloChecker();
        String checkMenstrualDate = myFloChecker.checkMenstrualCircle("2024-01-07", 31);
        assertEquals("Menstruation starts on Jan 7, 2024 and it ends on Feb 7, 2024, Fertile window is from Jan 21, 2024 to Jan 26, 2024, Ovulation occurs on Jan 24, 2024 and ends 12 to 24 hours after.", checkMenstrualDate);
    }
}