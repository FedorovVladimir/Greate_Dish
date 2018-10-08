package eat.leaf_eat;

import eat.Eat;

import java.awt.*;

public class Well extends LeafEat {

    public Well(LeafEat leafEat) {
        super(leafEat.getName(), leafEat.getLevel());
        setPathPhoto(getName());
    }

    @Override
    public String getName() {
        return super.getName() + "_well";
    }
}
