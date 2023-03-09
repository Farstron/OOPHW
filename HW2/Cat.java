package HW2;

public class Cat extends Pet implements Petable {
    private boolean presenceOfWool;
    public Cat(boolean presenceOfWool, String nickName, String breed, boolean vaccinations, 
    String color, String birthday, int height, int weight, String eyeColor){
        super(nickName, breed, vaccinations, color, birthday, height, weight, eyeColor);
        this.presenceOfWool = presenceOfWool;
    }
    public Cat(){
        this(true, "nickName", "breed", true, 
        "color", "birthday", 1, 1, "eyeColor");
    }
    public String PresenceOfWool(){
        return String.format("Наличие шерсти: %b", presenceOfWool);
    }
    @Override
    public String TakeCaress() {
        return String.format("Муррррр");
    }
    @Override
    public String Nois() {
        return String.format("Мяу");
    }
    @Override
    public String toString() {
        return("Кошка");
    }
}
