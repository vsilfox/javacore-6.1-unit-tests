package taxTypes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxTests {
    private IncomeTax testIncomeTax;

    @BeforeEach
    public void started() {
        System.out.println("test started");
        testIncomeTax = new IncomeTax();
    }

    @AfterEach
    public void finished() {
        System.out.println("test finished");
    }

    @Test
    public void testCalculateTaxFor() {
        double amount = 100000, expected = 13000;
        double result = testIncomeTax.calculateTaxFor(amount);
        assertEquals(expected, result);
    }
}