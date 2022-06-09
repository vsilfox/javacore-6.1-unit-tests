import taxType.*;

class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        ProgressiveTax progressiveTax = new ProgressiveTax();
        IncomeTax incomeTax = new IncomeTax();
        VATax vATax = new VATax();

        Bill[] payments = new Bill[]{
                new Bill(30_000, progressiveTax, taxService),
                new Bill(100_000, incomeTax, taxService),
                new Bill(200_239.10, progressiveTax, taxService),
                new Bill(10_001, vATax, taxService),
                new Bill(2_000_999, incomeTax, taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}