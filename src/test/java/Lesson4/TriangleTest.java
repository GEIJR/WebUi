package Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {

    @Test
    public void test() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(6, triangle.triangleSide(5, 3, 4));
        Assertions.assertThrows(MyException.class, () -> triangle.triangleSide(-3, 0, 3));
    }

    @ParameterizedTest
    @CsvSource({" 5, 3, 4, 6"})
    void testWithCsvSource1(int a, int b, int c, double S) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(triangle.triangleSide(a, b, c), S);
    }

    @ParameterizedTest
    @CsvSource({"5, 0, 4"})
    void testWithCsvSource2(int a, int b, int c) {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.triangleSide(a, b, c));

    }

    @ParameterizedTest
    @CsvSource({"-5, 3, 6"})
    void testWithCsvSource3(int a, int b, int c) {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.triangleSide(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 4"})
    void testWithCsvSource4(int a, int b, int c) {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.triangleSide(a, b, c));
    }
}