package HW2;

public abstract class Bird extends Animal{
    protected int flightHeight;
    protected Bird(int flightHeight, int height, int weight, String eyeColor) {
        super(height, weight, eyeColor);
        this.flightHeight = flightHeight;
    }
    public String Flight(){
        if (flightHeight > 0)
            return String.format("Я лечу на %d метрах", flightHeight);
        else 
            return String.format("Не могу летать");
    }
}

