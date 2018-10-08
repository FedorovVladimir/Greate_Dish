import eat.composite_eat.CompositeEatIterator;
import eat.composite_eat.Lunch;
import eat.leaf_eat.Meat;
import eat.leaf_eat.Well;

public class Main {
    public static void main(String[] args) {
        Lunch lunch = new Lunch("Обед", 0);
        Well wellMeat = new Well(new Meat());
        lunch.add(wellMeat);

        CompositeEatIterator iterator = lunch.createIterator();
        iterator.first();
        while (!iterator.isDone()) {
            System.out.print(iterator.currentItem().getName());
            iterator.next();
        }
    }
}
