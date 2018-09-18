package adapter;

public class UnzipperAdapter implements Unzipper {
    UnzipperPremium unzipperPremium;

    UnzipperAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("ISO")) {
            unzipperPremium = new IsoUnzipper();
        } else if (fileType.equalsIgnoreCase("JAR")) {
            unzipperPremium = new JarUnzipper();
        }
    }

    @Override
    public void unpack(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("ISO")) {
            unzipperPremium.unpackIso(fileName);
        } else if (fileType.equalsIgnoreCase("JAR")) {
            unzipperPremium.unpackJar(fileName);
        }
    }
}
