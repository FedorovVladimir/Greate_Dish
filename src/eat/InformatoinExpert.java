package eat;

import eat.leaf_eat.LeafEat;

import java.util.List;

public class InformatoinExpert {

    private List<Eat> menu;

    public InformatoinExpert(List<Eat> menu) {
        this.menu = menu;
    }

    public double getMoney() {
        double money = 0;
        for (Eat eat: menu)
            if (eat instanceof LeafEat)
                money += ((LeafEat) eat).getPrice();
            else
                money += getMoney(eat);
        return money;
    }

    private double getMoney(Eat eats) {
        double money = 0;
        for (Eat eat: eats.getChilds())
            if (eat instanceof LeafEat)
                money += ((LeafEat) eat).getPrice();
            else
                money += getMoney(eat);
        return money;
    }
}
