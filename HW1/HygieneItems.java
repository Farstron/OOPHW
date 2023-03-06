package HW1;

public class HygieneItems extends Products{
    protected int pack;
    public HygieneItems(int pack,int count, int price, String unitOfMeasurement, String name){
        super(name, price, count, "штуки");
        this.pack = pack;
    }
    public HygieneItems(){
        this(0, 0, 0, "штуки", "NULL");
    }
    public String getInfo(){
        return String.format("%s\nКоличество в упаковке: %d;", super.getInfo(), pack);
    }
}
