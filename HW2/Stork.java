package HW2;

public class Stork extends Bird{
    public Stork(int flightHeight, int height, int weight, String eyeColor) {
        super(flightHeight, height, weight, eyeColor);
    }
    public Stork(){
        this(10, 1, 1, "eyeColor");
    }
    @Override
    public String Nois() {
        return String.format("Дети нужны?");
    }

    @Override
    public String toString() {
        return String.format("Аист");
    }
}
