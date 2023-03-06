package HW1;

import java.util.ArrayDeque;

/**
 * HW1
 */
public class HW1 {

    public static void main(String[] args) {
        ArrayDeque<Products> productsQueue = new ArrayDeque<Products>();
        productsQueue.add(new Milk(3,15));
        productsQueue.add(new Milk(30));
        productsQueue.add(new Bread("Пшено",17));
        productsQueue.add(new Egg(12));
        productsQueue.add(new Lemonade("Лимон"));
        productsQueue.add(new Mask());
        productsQueue.add(new ToiletPaper());
        Info(productsQueue);
    }

    public static void Info(ArrayDeque<Products> productsQueue){
        for(Products p : productsQueue){
            System.out.println(p.getInfo());
        }
    }
}