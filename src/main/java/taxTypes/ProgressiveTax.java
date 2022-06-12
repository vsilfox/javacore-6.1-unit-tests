package taxTypes;

public class ProgressiveTax extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        if (amount > 100_000) {
            return amount * 0.15;
        }
        return amount * 0.1;
    }
}