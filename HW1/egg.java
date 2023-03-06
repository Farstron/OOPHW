package HW1;

public class Egg extends FoodProducts{
    protected int pack;
    protected static int index;
    static{
    Egg.index = 0;
    }
     /**
     * Конструктор яйца
     * @param pack количество в упаковке
     * @param count количество на складе
     * @param price цена за упаковку
     * @param shelfLife срок годности
     * @param unitOfMeasurement единицы измерения количества продукта в упаковке
     * @param name название продукта
     */
    public Egg(int pack,int count, int price, String shelfLife, String unitOfMeasurement, String name){
        super.name = name;
        super.shelfLife = shelfLife;
        super.unitOfMeasurement = unitOfMeasurement;
        super.price = price;
        super.count = count;
        this.pack = pack;
    }
    /**
     * Конструктор яйца
     * @param pack количество в упаковке
     * @param count количество на складе
     */
    public Egg(int pack,int count){
        this(pack, count, 80, "10 дней", "штуки", String.format("Яйца %d", ++index));
    }
    /**
     * Конструктор яйца
     * @param pack количество в упаковке
     */
    public Egg(int pack){
        this(pack, 1);
    }
    public Egg(){
        this(0, 0);
    }
    public String getInfo(){
        return String.format("%s\nКоличество в упаковке: %d; \n", super.getInfo(), pack);
    }
}
