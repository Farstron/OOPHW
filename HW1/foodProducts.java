package HW1;

public class foodProducts extends Products{
    protected String shelfLife;
    public foodProducts(String SL){
        this.shelfLife = SL;
    }
    public String getInfo(){
        return String.format("%s\nСрок годности: %s;", super.getInfo(), shelfLife);
    }
}
