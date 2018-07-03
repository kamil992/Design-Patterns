package fluentBuilder.classicBuilder.objects;

public class Gears {

    private int numsOfGear;

    public int getNumsOfGear() {
        return numsOfGear;
    }

    public void setNumsOfGear(int numsOfGear) {
        this.numsOfGear = numsOfGear;
    }

    @Override
    public String toString() {
        return "Gears{" +
                "numsOfGear=" + numsOfGear +
                '}';
    }
}
