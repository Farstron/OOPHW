package HW1;

/**
 * Drink
 */
public class Drink extends Products {
    protected double volume;
    /**
     * Конструктор напитков
     * @param volume Обьем
     * @param count Количество на складе
     * @param price Цена за упаковку
     * @param unitOfMeasurement Единица измерений
     * @param name Наименование
     */
    public Drink(double volume,int count, int price, String unitOfMeasurement, String name){
        super.name = name;
        super.unitOfMeasurement = "литры";
        super.price = price;
        super.count = count;
        this.volume = volume;
    }
    public Drink(){
        super(" ", 0, 0, "литры");
    }
    public String getInfo(){
        return String.format("%s\nОбъем: %.2f;", super.getInfo(), volume);
    }
}