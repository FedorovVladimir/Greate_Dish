package eat.leaf_eat;

import eat.Eat;

import java.util.List;

public abstract class LeafEat extends Eat {
    LeafEat(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(Eat eat) {

    }

    @Override
    public List<Eat> getChilds() {
        return null;
    }

    @Override
    public Eat getChild(int index) {
        return null;
    }

    @Override
    public void remove(Eat eat) {

    }

    public abstract double getPrice();
}
