public class StudentDiscount implements DiscountStrategy{
    public double apply(double price){
        return price * 0.7;
    } 
}