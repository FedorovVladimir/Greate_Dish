package eat_photo;

class RealPhotoAdapter {
    static RealPhoto createRealPhoto(String name) {
        String path = "img\\" + name + ".jpg";
        return (RealPhoto) FlyWeightFactoryRealPhoto.getFlyWeightRealPhoto(path);
    }

    static String getPath(String pathPhoto) {
        return pathPhoto + ".jpg";
    }
}
