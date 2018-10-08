package eat.leaf_eat;

public class Meat extends LeafEat {
    public Meat() {
        super("Meat", 1);
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
