package eat_photo;

import player.Cook;
import utils.Photo;

import java.awt.*;

public class ProxyPhoto implements Photo {
    private RealPhoto realPhoto;
    private ClosedPhoto closedPhoto;
    private int dishLevel;

    public ProxyPhoto(String name, int dishLevel) {
        realPhoto = RealPhotoAdapter.createRealPhoto(name);
        closedPhoto = ClosedPhoto.getInstance();
        this.dishLevel = dishLevel;
    }

    @Override
    public Image getPhoto() {
        if (dishLevel > Cook.getInstance().getLevel()) {
            return realPhoto.getPhoto();
        } else {
            return closedPhoto.getPhoto();
        }
    }

    public void setPathPhoto(String pathPhoto) {
        realPhoto.setPathPhoto(RealPhotoAdapter.getPath(pathPhoto));
    }
}
