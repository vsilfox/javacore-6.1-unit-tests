package taxTypes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VATaxTests {
    private VATax testVATax;

    @BeforeEach
    public void started() {
        System.out.println("test started");
        testVATax = new VATax();
    }

    @AfterEach
    public void finished() {
        System.out.println("test finished");
    }

    @Test
    public void testCalculateTaxFor() {
        double amount = 900, expected = 162;
        double result = testVATax.calculateTaxFor(amount);
        assertEquals(expected, result);
    }
}