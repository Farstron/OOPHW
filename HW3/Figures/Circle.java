package HW3.Figures;

import HW3.Figures.Base.Figure;
import HW3.Figures.Base.Lengthable;

public class Circle implements Figure, Lengthable{
    public int radius;
    public Circle(int radius){
        this.radius = radius;
        // try{
        //     if (radius <= 0){
        //         throw new Exception("Радиус должен быть больше нуля");
        //     }
        //     else{
                
        //     }
        // }
        // catch(Exception ex){
        //     System.out.println(ex.getMessage());
        // }
    }
    public Circle(){
        this(5);
       
    }
    public double length(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return String.format("Круг");
    }
}
