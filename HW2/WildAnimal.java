package HW2;

public abstract class WildAnimal extends Animal{
    String habitat;
    String dateOfLocation;
    public WildAnimal(String habitat,String dateOfLocation,
    int height, int weight, String eyeColor){
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }   
    @Override
    public String Info() {
        return String.format("%sМесто обитания: %s\nДата нахождения: %s\n", super.Info(),habitat,dateOfLocation);
    }
}
