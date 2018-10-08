package eat_photo;

class RealPhotoAdapter {
    static RealPhoto createRealPhoto(String name) {
        String path = name + ".jpg";
        return new RealPhoto(path);
    }

    static String getPath(String pathPhoto) {
        return pathPhoto + ".jpg";
    }
}
