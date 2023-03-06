package HW1;

/**
 * HW1
 */
public class HW1 {

    public static void main(String[] args) {
        Products milk = new Milk(3,15);
        Products milk2 = new Milk(30);
        Products bread = new Bread("Пшено",17);
        Products egg = new Egg(12);
        System.out.println(milk.getInfo());
        System.out.println(milk2.getInfo()); 
        System.out.println(bread.getInfo()); 
        System.out.println(egg.getInfo()); 
    }
}