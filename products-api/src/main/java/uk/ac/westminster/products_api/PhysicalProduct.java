// A PhysicalProduct IS-A Product because it is still an item for sale with an id, name and price
// An Order is NOT a Product: an order HAS products in it, it isn't one.
package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct () {
    }
    public PhysicalProduct (Long id, String name, double price, double weightKg, String dimensions) {
        super (id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
//        this.discountedPrice = price;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + "kg";
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
