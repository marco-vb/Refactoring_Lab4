package pt.up.fe.ldts.example3;

public class PercentageDiscount extends Discount {
    public PercentageDiscount(double amount) {
        super(amount);
    }

    public double applyDiscount(double price) {
        return price * (1 - getAmount());
    }
}
