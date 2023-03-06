package HW1;

public class Mask extends HygieneItems{
    protected static int index;
    static{
    Mask.index = 0;
    }
    public Mask(int pack,int count, int price, String unitOfMeasurement, String name){
        super(pack, count, price, unitOfMeasurement, name);
    }
    public Mask(int pack, int count){
        this(pack, count, count, "Штуки", String.format("Маска %d", ++index));
    }
    public Mask(){
        this(1, 1);
    }
    public String getInfo(){
        return String.format("%s\n", super.getInfo());
    }
}
