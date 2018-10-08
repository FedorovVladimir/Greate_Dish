package eat_photo;

import utils.Photo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class RealPhoto implements Photo, FlyWeightRealPhoto {
    private Image image = null;
    private String pathPhoto;

    RealPhoto(String pathPhoto) {
        this.pathPhoto = pathPhoto;
    }

    @Override
    public Image getPhoto() {
        if (image == null) {
            try {
                File file = new File(pathPhoto);
                image = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return image;
    }

    void setPathPhoto(String pathPhoto) {
        if (!this.pathPhoto.equals(pathPhoto)) {
            image = null;
            this.pathPhoto = pathPhoto;
        }
    }

    @Override
    public String getPath() {
        return pathPhoto;
    }
}
