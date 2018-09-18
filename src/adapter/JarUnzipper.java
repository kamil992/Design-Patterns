package adapter;

public class JarUnzipper implements UnzipperPremium {
    @Override
    public void unpackJar(String fileName) {
        System.out.println(fileName + ".jar file was unpacked.");
    }
}
