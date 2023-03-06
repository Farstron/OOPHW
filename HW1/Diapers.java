package HW1;

public class Diapers extends ChildenProducts{
    protected int size;
    protected int minWeight;
    protected int maxWeight;
    protected String type;
    protected static int index;
    static{
        Diapers.index = 0;
    }
    public Diapers(int size, int minWeight, int maxWeight, String type, int minAge, boolean hypoallergenicity, String name, int price, int count, String unitOfMeasurement){
        super(minAge, hypoallergenicity, name, price, count, unitOfMeasurement);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }
    public Diapers(int size, int minWeight, int maxWeight, String type){
        this(size, minWeight, maxWeight, type, 0, true, String.format("Подгузгики %d", ++index), 500, 1, "штуки");
    }
    public Diapers(){
        this(1, 3, 6, "type");
    }
    public String getInfo(){
        return String.format("%s\nРазмер: %d;\n Минимальный вес: %d;\nМаксимальный вес: %d;\nТип: %s;\n", super.getInfo(), size, minWeight, maxWeight, type);
    }
}
