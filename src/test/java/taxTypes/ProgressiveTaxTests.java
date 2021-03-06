package taxTypes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressiveTaxTests {
    private ProgressiveTax testProgressiveTax;

    @BeforeEach
    public void started() {
        System.out.println("test started");
        testProgressiveTax = new ProgressiveTax();
    }

    @AfterEach
    public void finished() {
        System.out.println("test finished");
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testCalculateTaxFor(double amount, double expected) {
        double result = testProgressiveTax.calculateTaxFor(amount);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of(30000, 3000), Arguments.of(200000, 30000));
    }
}