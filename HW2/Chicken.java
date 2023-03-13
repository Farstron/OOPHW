package HW2;

public class Chicken extends Bird{
    
    public Chicken(int flightHeight, int height, int weight, String eyeColor) {
        super(0, height, weight, eyeColor);
    }
    public Chicken(){
        this(0, 1, 1, "eyeColor");
    }
    @Override
    public String Nois() {
        return String.format("Кококо");
    }

    @Override
    public String toString() {
        return String.format("Курица");
    }
    
}
