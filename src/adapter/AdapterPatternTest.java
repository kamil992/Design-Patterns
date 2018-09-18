package adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        UnzipperApp unzipperApp = new UnzipperApp();

        unzipperApp.unpack("RAR", "photos");
        unzipperApp.unpack("iso", "music");

        unzipperApp.setPremium(true);
        unzipperApp.unpack("jar", "photos");
    }
}
