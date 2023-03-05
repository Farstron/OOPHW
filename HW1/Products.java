package HW1;

public class Products {
    protected String name;
    protected int price;
    protected static int count;
    protected String unitOfMeasurement;
    static{
        Products.count = 0;
    }
    /**
     * Конструктор Продуктов    
     * @param name Наименование продукта
     * @param price Цена продукта
     * @param count Количество продукта
     * @param unitOfMeasurement Единица измерения
     */
    public Products (String name, int price, String unitOfMeasurement){
        this.name = name;
        this.price = price;
        // this.count = count;
        this.unitOfMeasurement = unitOfMeasurement;
    }
    public Products(){
        this("NULL", 0, "NULL");
    }
    public String getInfo(){
        return String.format("Наименование: %s;\nЦена: %d рублей;\nКоличество: %d;\nЕдиница измерения: %s;", name, price, count, unitOfMeasurement);
    }
}
