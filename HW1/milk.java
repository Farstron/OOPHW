package HW1;

public class milk extends foodProducts{
    protected int Fat;
    public milk(int Fat){
        super.name = "Молоко";
        super.shelfLife = "3 дня";
        super.unitOfMeasurement = "Литры";
        super.price = 75;
        milk.count += 1;
        this.Fat = Fat;
    }
    public milk(){
        this(0);
    }
    public String getInfo(){
        return String.format("%s\nПроцент жирности: %d;", super.getInfo(), Fat);
    }
}
