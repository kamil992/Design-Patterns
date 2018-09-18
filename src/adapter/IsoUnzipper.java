package adapter;

public class IsoUnzipper implements UnzipperPremium {

    @Override
    public void unpackIso(String fileName) {
        System.out.println(fileName + ".iso file was unpacked.");
    }
}
