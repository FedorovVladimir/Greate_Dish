package eat.composite_eat;

import eat.Eat;
import utils.Aggregate;
import utils.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CompositeEat extends Eat implements Aggregate {
    private List<Eat> eats = new ArrayList<>();

    CompositeEat(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(Eat eat) {
        eats.add(eat);
    }

    @Override
    public List<Eat> getChilds() {
        return eats;
    }

    @Override
    public Eat getChild(int index) {
        return eats.get(index);
    }

    @Override
    public void remove(Eat eat) {
        eats.remove(eat);
    }

    @Override
    public CompositeEatIterator createIterator() {
        return new CompositeEatIterator(eats);
    }
}
