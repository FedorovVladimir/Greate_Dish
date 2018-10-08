package eat.composite_eat;

import eat.Eat;
import utils.Iterator;

import java.util.List;

public class CompositeEatIterator implements Iterator {
    private int index = 0;
    private List<Eat> eats;

    CompositeEatIterator(List<Eat> eats) {
        this.eats = eats;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public boolean isDone() {
        return !(index < eats.size());
    }

    @Override
    public Eat currentItem() {
        return eats.get(index);
    }
}
