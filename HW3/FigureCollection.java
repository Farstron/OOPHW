package HW3;

import HW3.Figures.Circle;
import HW3.Figures.Rectangle;
import HW3.Figures.Square;
import HW3.Figures.Triangle;
import HW3.Figures.Base.Figure;
import HW3.Figures.Base.Lengthable;
import HW3.Figures.Base.Perimeterable;

import java.util.ArrayList;
import java.util.Comparator;

public class FigureCollection {
    ArrayList<Figure> figureList;
    public FigureCollection(){
        this.figureList = new ArrayList<Figure>();
    }
    public void getFiguresParametrs(){
        for(Figure i : figureList){
            System.out.println(i);
            System.out.println(String.format("Площадь: %f", i.area()));
            if(i instanceof Perimeterable){
            Perimeterable perimeterable = (Perimeterable)i;
            System.out.println(String.format("Периметр: %f", perimeterable.perimeter()));
            }
            if(i instanceof Lengthable){
            Lengthable lengthable = (Lengthable)i;
            System.out.println(String.format("Длина окружности: %f", lengthable.length()));
            }
            System.out.println();
        }
    }
    public void addFigure(Figure newFigure){
        // if(newFigure instanceof Circle){
        //     Circle circle = (Circle)newFigure;
        //     if (circle.radius > 0) figureList.add(circle);
        //     else System.out.println("Радиус меньше нуля");
        // }
        // if(newFigure instanceof Triangle){
        //     Triangle triangle = (Triangle)newFigure;
        //     figureList.add(triangle);
        //     // if (triangle.radius > 0) 
        //     // else System.out.println("Радиус меньше нуля");
        // }
        // if(newFigure instanceof Square){
        //     Square square = (Square)newFigure;
        //     figureList.add(square);
        //     // if (square.radius > 0) 
        //     // else System.out.println("Радиус меньше нуля");
        // }
        // if(newFigure instanceof Rectangle){
        //     Rectangle rectangle = (Rectangle)newFigure;
        //     figureList.add(rectangle);
        //     // if (rectangle.radius > 0) 
        //     // else System.out.println("Радиус меньше нуля");
        // }
        figureList.add(newFigure);
    }
    public void delFigure(int figureIndex){
        figureList.remove(figureIndex);
    }
    public void changesFigure(int figureIndex, Figure newFigure){
        figureList.set(figureIndex, newFigure);
    }
    public void sortFigure(){
        figureList.sort(Comparator.comparing(Figure::area));
    }
}
