package HW1;

public class ChildenProducts extends Products{
    protected int minAge;
    protected boolean hypoallergenicity;
    public ChildenProducts(int minAge, boolean hypoallergenicity, String name, int price, int count, String unitOfMeasurement){
        super(name, price, count, unitOfMeasurement);
        this.minAge = minAge;
        this.hypoallergenicity = hypoallergenicity;
    }
    public ChildenProducts(){
        this(0, true, "NULL", 0, 0, "NULL");
    }
    public String getInfo(){
        return String.format("%s\nМинимальный возраст: %d;\n Гипоаллергенность: %b;\n", super.getInfo(), minAge, hypoallergenicity);
    }
}
