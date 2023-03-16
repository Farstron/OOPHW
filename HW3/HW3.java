package HW3;

import HW3.Figures.*;


public class HW3 {
    public static void main(String[] args) {
        FigureCollection figureCollection = new FigureCollection();
        figureCollection.addFigure(new Circle());
        figureCollection.addFigure(new Rectangle());
        figureCollection.addFigure(new Triangle());
        figureCollection.addFigure(new Square());
        figureCollection.addFigure(new Square());
        figureCollection.getFiguresParametrs();
        System.out.println("___-");
        figureCollection.changesFigure(4, new Triangle());
        figureCollection.getFiguresParametrs();
        System.out.println("___-");
        figureCollection.delFigure(4);
        figureCollection.getFiguresParametrs();
        System.out.println("___-");
        figureCollection.sortFigure();
        figureCollection.getFiguresParametrs();
    }
}
