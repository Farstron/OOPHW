package HW2;

public class Wolf extends WildAnimal{
    private boolean leader;
    public Wolf(boolean leader, String habitat, String dateOfLocation, int height, int weight, String eyeColor) {
        super(habitat, dateOfLocation, height, weight, eyeColor);
        this.leader = leader;
    }
    public Wolf(){
        this(false, "habitat", "dateOfLocation", 1, 1, "eyeColor");
    }
    @Override
    public String toString() {
        return String.format("Волк");
    }

    @Override
    public String Nois() {
        return String.format("УУУУУУ");
    }
    @Override
    public String Info() {
        return String.format("%s Вожак стаи: %b\n", super.Info(),leader);
    }
}
