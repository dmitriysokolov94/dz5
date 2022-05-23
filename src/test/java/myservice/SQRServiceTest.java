package myservice;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    void ifTheBoundsAreCorrect() {
        SQRService service = new SQRService();
        int border = 200;
        int border2 = 300;
        int expected = 3;


        long actual = service.numberSquareCounter(border, border2);

        assertEquals(expected, actual);
    }

    @Test
    void ifBoundsAreNegativeNumbers() {
        SQRService service = new SQRService();
        int border = -200;
        int border2 = -400;
        int expected = 0;


        long actual = service.numberSquareCounter(border, border2);

        assertEquals(expected, actual);
    }
}