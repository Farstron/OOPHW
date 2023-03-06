package HW1;

public class Lemonade extends Drink{
    protected String taste;
    protected static int index;
    static{
    Lemonade.index = 0;
    }
    /**
     * Конструктор лимонадов
     * @param taste Вкус лимонада
     * @param volume Объем
     * @param count Количество на складе
     * @param price Цена за упаковку
     * @param unitOfMeasurement Единица измерения
     * @param name Наименование
     */
    public Lemonade(String taste, double volume,int count, int price, String unitOfMeasurement, String name){
        super(volume, count, price, unitOfMeasurement, name);
        this.taste = taste;
    }
    public Lemonade(String taste, int count){
        this(taste, 1.75, count, 45, "литры", String.format("Лимонад %d", ++index));
    }
    public Lemonade(String taste){
        this(taste, 1);
    }
    public Lemonade(){
        this("NULL", 0, 0, 0, "NULL", "NULL");
    }
    public String getInfo(){
        return String.format("%s\nВкус: %s;\n", super.getInfo(), taste);
    }
}
