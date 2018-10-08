package eat_photo;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightFactoryRealPhoto {
    private static List<FlyWeightRealPhoto> photoList = new ArrayList<>();

    public static FlyWeightRealPhoto getFlyWeightRealPhoto(String path) {
        boolean isCreate = false;
        FlyWeightRealPhoto oldPhoto = null;
        for (FlyWeightRealPhoto photo: photoList) {
            if (photo.getPath().equals(path)) {
                isCreate = true;
                oldPhoto = photo;
                break;
            }
        }

        if (isCreate) {
            return oldPhoto;
        } else {
            FlyWeightRealPhoto realPhoto = new RealPhoto(path);
            photoList.add(realPhoto);
            return realPhoto;
        }
    }

    public static void display() {
        String str = "";
        for (FlyWeightRealPhoto photo: photoList) {
            str += photo.getPath();
            str += " " + photo + "\n";
        }
        System.out.println(str);
    }
}
