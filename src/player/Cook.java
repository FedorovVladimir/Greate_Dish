package player;

import utils.Level;

public class Cook implements Level {
    private int level = 1;
    private static Cook cook = null;

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void upLevel() {
        level++;
    }

    public static Cook getInstance() {
        if (cook == null) {
            cook = new Cook();
        }
        return cook;
    }
}
