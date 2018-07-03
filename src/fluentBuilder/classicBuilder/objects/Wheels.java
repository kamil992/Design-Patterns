package fluentBuilder.classicBuilder.objects;

public class Wheels {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                '}';
    }
}
