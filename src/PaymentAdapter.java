class PaymentAdapter implements Payment {
    private PaymentProcessor paymentProcessor;
    private String accountNumber;

    public PaymentAdapter(PaymentProcessor paymentProcessor, String accountNumber) {
        this.paymentProcessor = paymentProcessor;
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(double amount) {
        paymentProcessor.makePayment(accountNumber, amount);
    }
}
