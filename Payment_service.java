class PaymentService {
    public boolean makePayment(String username, double amount) {
        System.out.println("Payment of $" + amount + " made successfully by " + username);
        return true;
    }
}
