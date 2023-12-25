package Behavioral.NullObject;

public class NullObjectPatternExample {
    public static void main(String[] args) {
        final double price = 1000;
        applyCountryTaxToPrice(price, "Chia");
        applyCountryTaxToPrice(price, "Germany");
        applyCountryTaxToPrice(price, "Vietnam");
        applyCountryTaxToPrice(price, "Thailand");
        applyCountryTaxToPrice(price, null);
    }

    public static void applyCountryTaxToPrice(double price, String country) {
        Tax tax = TaxFactory.getTaxByCountry(country);
        System.out.println(tax.getCountry() + ": " + tax.apply(price));
    }
}
