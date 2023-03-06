package HW1;

public class FoodProducts extends Products{
    protected String shelfLife;
    public FoodProducts(String SL){
        this.shelfLife = SL;
    }
    public FoodProducts(){
        this("NULL");
    }
    public String getInfo(){
        return String.format("%s\nСрок годности: %s;", super.getInfo(), shelfLife);
    }
}
