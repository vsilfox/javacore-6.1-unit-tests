package taxTypes;

public class IncomeTax extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.13;
    }
}