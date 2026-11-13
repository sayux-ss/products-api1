package uk.ac.westminster.products_api;

public interface Discountable {
    void applyDiscount(double rate);
    double getDiscountedPrice();
}
