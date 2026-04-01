public class PaymentProcessor {
    private final PaymentGateway gateway;
    private final fileLogger logger;

    public PaymentProcessor(PaymentGateway gateway, fileLogger logger) {
        this.gateway = gateway;
        this.logger = logger;
    }

    public void pay(double amount) {
        gateway.execute(amount);
        logger.log("Paid: " + amount);
    }
}