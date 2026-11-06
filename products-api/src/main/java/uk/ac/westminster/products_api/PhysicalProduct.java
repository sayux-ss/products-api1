// A PhysicalProduct IS-A Product because it is still an item for sale with an id, name and price
// An Order is NOT a Product: an order HAS products in it, it isn't one.
package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct () {
    }
    public PhysicalProduct (Long id, String name, double price, double weightKg, String dimensions) {
        super (id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
