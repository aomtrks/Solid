public class VipDiscount implements DiscountStrategy{
    public double apply(double price){
        return price * 0.8;
    } 
}