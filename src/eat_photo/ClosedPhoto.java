package eat_photo;

import utils.Photo;

import java.awt.*;

public class ClosedPhoto implements Photo {
    private RealPhoto photo;
    private static ClosedPhoto closedPhoto;

    private ClosedPhoto (RealPhoto photo) {
        this.photo = photo;
    }

    static ClosedPhoto getInstance() {
        if (closedPhoto == null) {
            RealPhoto closedDishPhoto = RealPhotoAdapter.createRealPhoto("Closed_Dish");
            closedPhoto = new ClosedPhoto(closedDishPhoto);
        }
        return closedPhoto;
    }

    @Override
    public Image getPhoto() {
        return photo.getPhoto();
    }
}
