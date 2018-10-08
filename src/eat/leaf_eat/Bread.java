package eat.leaf_eat;

public class Bread extends LeafEat {
    public Bread() {
        super("Bread", 1);
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
