package HW1;

public class Nipple extends ChildenProducts{
    protected static int index;
    static{
        Diapers.index = 0;
    }
    public Nipple(int minAge, boolean hypoallergenicity, String name, int price, int count, String unitOfMeasurement){
        super(minAge, hypoallergenicity, name, price, count, unitOfMeasurement);
    }
    public Nipple(){
        this(0, true, String.format("Соска %d", ++index), 150, 1, "штуки");
    }
    public String getInfo(){
        return String.format("%s\n", super.getInfo());
    }
}
