package HW1;

public class ToiletPaper extends HygieneItems{
    protected int layers;
    protected static int index;
    static{
        ToiletPaper.index = 0;
    }
    public ToiletPaper(int layers, int pack, int count, int price, String unitOfMeasurement, String name){
        super(pack, count, price, unitOfMeasurement, name);
        this.layers = layers;
    }
    public ToiletPaper(int layers, int count){
        this(layers, 4, count, 140, "штуки", String.format("Туалетная бумага %d", ++index));
    }
    public ToiletPaper(){
        this(3, 1);
    }
    public String getInfo(){
        return String.format("%s\nКоличество слоев: %d;\n", super.getInfo(), layers);
    }
}
