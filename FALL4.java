abstract class Payment {
    abstract void pay(double amount);

    abstract void refund(double amount);

    void paymentStatus() {
        System.out.println("Payment processed successfully.");
    }
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Credit Card Payment: Rs." + amount + " paid.");
    }

    void refund(double amount) {
        System.out.println("Credit Card Refund: Rs." + amount + " refunded.");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("UPI Payment: Rs." + amount + " paid.");
    }

    void refund(double amount) {
        System.out.println("UPI Refund: Rs." + amount + " refunded.");
    }
}

class NetBanking extends Payment {
    void pay(double amount) {
        System.out.println("Net Banking Payment: Rs." + amount + " paid.");
    }

    void refund(double amount) {
        System.out.println("Net Banking Refund: Rs." + amount + " refunded.");
    }
}

public class FALL4 {
    static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay(5000);
        p1.paymentStatus();
        p1.refund(1000);

        System.out.println();

        Payment p2 = new UPIPayment();
        p2.pay(2500);
        p2.paymentStatus();
        p2.refund(500);

        System.out.println();

        Payment p3 = new NetBanking();
        p3.pay(8000);
        p3.paymentStatus();
        p3.refund(2000);
    }
}
