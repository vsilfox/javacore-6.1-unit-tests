import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import taxType.IncomeTax;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxTests {
    IncomeTax sut;

    @BeforeEach
    public void started() {
        System.out.println("test started");
        sut = new IncomeTax();
    }

    @AfterEach
    public void finished() {
        System.out.println("test finished");
    }

    @Test
    public void testCalculateTaxFor() {
        double amount = 100000, expected = 13000;
        double result = sut.calculateTaxFor(amount);
        assertEquals(expected, result);
    }
}