package pt.up.fe.ldts.example3;

public class FixedDiscount extends Discount {
    public FixedDiscount(double fixed) {
        super(fixed);
    }

    public double applyDiscount(double price) {
        return price > getAmount() ? price - getAmount() : 0;
    }
}
