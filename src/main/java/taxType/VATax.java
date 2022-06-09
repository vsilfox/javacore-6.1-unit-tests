package taxType;

public class VATax extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}