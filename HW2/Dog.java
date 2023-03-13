package HW2;

public class Dog extends Pet implements  Trainable{
    private boolean training = false;
    public Dog(String nickName, String breed, boolean vaccinations, String color, String birthday, int height,
            int weight, String eyeColor) {
        super(nickName, breed, vaccinations, color, birthday, height, weight, eyeColor);
    }
    public Dog(){
        this("nickName", "breed", true, "color", "birthday", 1, 1, "eyeColor");
    }
    @Override
    public String Train() {
        if (training == false){
            training = true;
            return String.format("Дрессировка прошла успешно");
        }else{
            return String.format("Дрессировка невозможна");
        }
    }

    @Override
    public String TakeCaress() {
        return String.format("Вуф");
    }

    @Override
    public String Nois() {
        return String.format("Ав");
    }
    @Override
    public String toString() {
        return("Собака");
    }
}
