package adapter;

public class UnzipperApp implements Unzipper {
    private UnzipperAdapter unzipperAdapter;
    private boolean isPremium;

    @Override
    public void unpack(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("RAR")) {
            System.out.println(fileName + "." + fileType.toLowerCase() + " was unpacked.");
        }
        else if (isPremium) {
            if (fileType.equalsIgnoreCase("ISO")) {
                unzipperAdapter = new UnzipperAdapter(fileType);
                unzipperAdapter.unpack(fileType, fileName);
            } else if (fileType.equalsIgnoreCase("JAR")) {
                unzipperAdapter = new UnzipperAdapter(fileType);
                unzipperAdapter.unpack(fileType, fileName);
            }
        }

        else
            System.out.println("You may have not premium account, or You entered incorrect File extension");
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
