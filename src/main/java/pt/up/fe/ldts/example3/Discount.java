package pt.up.fe.ldts.example3;

public abstract class Discount {
    private final double amount;

    public Discount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double applyDiscount(double price);
}
