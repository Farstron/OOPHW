package HW2;

public abstract class Animal {
    static int ID = 0;
    protected int height;
    protected int weight;
    protected String eyeColor;
    public Animal(int height, int weight, String eyeColor){
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
    public abstract String Nois();
    public String Info(){
        return String.format("Рост: %d\nВес: %d\nЦвет глаз: %s\n", height, weight, eyeColor);
    };
}
