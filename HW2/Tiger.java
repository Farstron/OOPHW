package HW2;

public class Tiger extends WildAnimal{

    public Tiger(String habitat, String dateOfLocation, int height, int weight, String eyeColor) {
        super(habitat, dateOfLocation, height, weight, eyeColor);
    }
    public Tiger(){
        this("habitat", "dateOfLocation", 1, 1, "eyeColor");
    }
    @Override
    public String Nois() {
        return String.format("Рррррр");
    }
    @Override
    public String toString() {
        return("Тигр");
    }
}
