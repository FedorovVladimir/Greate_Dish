package utils;

import eat.Eat;

public interface Iterator {
    void first();

    void next();

    boolean isDone();

    Eat currentItem();
}
