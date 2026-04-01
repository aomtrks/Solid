public class Invoice2{ 
    private double amount;

    public Invoice2(double amount) { this.amount = amount; }

    public void calculateTotal() { 
        this.amount = this.amount * 1.20; // adding tax
    }
}
