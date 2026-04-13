public class DiscountManager {
    public double processDiscount(DiscountStrategy discount) {
        return discount.apply();
    }
}