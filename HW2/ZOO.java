package HW2;


import java.util.ArrayList;
import java.util.Scanner;

public class ZOO {
    ArrayList<Animal> ZOOList;
    public ZOO(){
        ZOOList = new ArrayList<Animal>();
    }
    public void AddAnimal(Animal NEW){
        ZOOList.add(NEW);
    }
    public void DelAnimal(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index = in.nextInt();
        in.close();
        ZOOList.remove(index);
        
        
    }
    public void getInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index = in.nextInt();
        in.close();
        System.out.println(ZOOList.get(index));
        System.out.println(ZOOList.get(index).Info()); 
        
        
    }
    public void getNois(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index = in.nextInt();
        in.close();
        System.out.println(ZOOList.get(index));
        System.out.println(ZOOList.get(index).Nois()); 
        
        
    }
    public void getInfoZOO(){
        for(Animal i : ZOOList){
            System.out.println(i);
            System.out.println(i.Info());
        }
    }
    public void getNoisZOO(){
        for(Animal i : ZOOList){
            System.out.println(i);
            System.out.println(i.Nois());
        }
    }
}
