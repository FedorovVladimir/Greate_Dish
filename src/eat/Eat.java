package eat;

import eat_photo.ProxyPhoto;
import utils.Level;
import utils.Photo;

import java.awt.*;
import java.util.List;

public abstract class Eat implements Level, Photo {
    private ProxyPhoto photoProxy;
    private String name;
    private int level;

    public Eat(String name, int level) {
        this.name = name;
        this.level = level;
        photoProxy = new ProxyPhoto(name, level);
    }

    @Override
    public Image getPhoto() {
        return photoProxy.getPhoto();
    }

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

    public abstract void add(Eat eat);

    public abstract List<Eat> getChilds();

    public abstract Eat getChild(int index);

    public abstract void remove(Eat eat);

    protected void setPathPhoto(String pathPhoto) {
        photoProxy.setPathPhoto(pathPhoto);
    }

    public String getName() {
        return name;
    }
}
