package eat.leaf_eat;

import eat.Eat;

import java.awt.*;

public class Well extends LeafEat {

    LeafEat leafEat;

    public Well(LeafEat leafEat) {
        super(leafEat.getName(), leafEat.getLevel());
        setPathPhoto(getName());
        this.leafEat = leafEat;
    }

    @Override
    public String getName() {
        return super.getName() + "_well";
    }

    @Override
    public double getPrice() {
        return leafEat.getPrice() + 100;
    }
}
