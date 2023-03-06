package HW1;

public class Milk extends FoodProducts{
    protected int Fat;
    protected static int index;
    static{
        Milk.index = 0;
    }
    /**
     * Конструктор молока
     * @param Fat процент жирности
     * @param count количество на складе
     * @param price цена за упаковку
     * @param shelfLife срок годности
     * @param unitOfMeasurement единицы измерения количества продукта в упаковке
     * @param name название продукта
     */
    public Milk(int Fat,int count, int price, String shelfLife, String unitOfMeasurement, String name){
        super.name = name;
        super.shelfLife = shelfLife;
        super.unitOfMeasurement = unitOfMeasurement;
        super.price = price;
        super.count = count;
        this.Fat = Fat;
    }
    /**
     * Конструктор молока
     * @param Fat процент жирности
     * @param count количество на складе
     */
    public Milk(int Fat, int count){
        this(Fat, count, 75, "3 дня", "литры", String.format("Молоко %d" , ++index));
    }
    /**
     * Конструктор молока
     * @param Fat процент жирности
     */
    public Milk(int Fat){
        this(Fat,1);
    }
    public Milk(){
        this(0, 0);
    }
    public String getInfo(){
        return String.format("%s\nПроцент жирности: %d; \n", super.getInfo(), Fat);
    }
}
