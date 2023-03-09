package HW2;

public abstract class Pet extends Animal implements Petable{
    protected String nickName;
    protected String breed;
    protected boolean vaccinations;
    protected String color;
    protected String birthday;
    public Pet(String nickName, String breed, boolean vaccinations, 
    String color, String birthday,int height, int weight, String eyeColor){
        super(height,weight,eyeColor);
        this.nickName = nickName;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.color = color;
        this.birthday = birthday;
    }
}

