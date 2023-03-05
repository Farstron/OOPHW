package HW1;

public class Bread extends foodProducts{
    protected String type;
    protected static int index;
    static{
        Bread.index = 0;
    }
     /**
     * Конструктор хлеба
     * @param type вид пшеницы
     * @param count количество на складе
     * @param price цена за упаковку
     * @param shelfLife срок годности
     * @param unitOfMeasurement единицы измерения количества продукта в упаковке
     * @param name название продукта
     */
    public Bread(String type,int count, int price, String shelfLife, String unitOfMeasurement, String name){
        super.name = name;
        super.shelfLife = shelfLife;
        super.unitOfMeasurement = unitOfMeasurement;
        super.price = price;
        super.count = count;
        this.type = type;
    }
    /**
     * Конструктор хлеба
     * @param type вид пшеницы
     * @param count количество на складе
     */
    public Bread(String type,int count){
        this(type, count, 50, "10 дней", "граммы", String.format("Хлеб %d", ++index));
    }
    /**
     * Конструктор хлеба
     * @param type вид пшеницы
     */
    public Bread(String type){
        this(type, 1);
    }
    public Bread(){
        this("NULL", 0);
    }
    public String getInfo(){
        return String.format("%s\nТип муки: %s; \n", super.getInfo(), type);
    }
}
