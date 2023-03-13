package HW2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        ZOO ar = new ZOO();
        boolean stop = false;
        Menu(stop, ar);
    }
    public static void Menu(boolean stop, ZOO list){
        
        if (stop == false){
            Scanner i = new Scanner(System.in);
            System.out.println("1. Добавить животное в зоопарк\n2. Убирать животное из зоопарка\n3. Посмотреть информацию о животном\n4. Заставить животное издать звук\n5. Напечатать информацию о животных\n6. Заставить всех животных издать звук\n7. Выйти из зоопарка\n");
            int num = i.nextInt();
            if (num == 1) {
                System.out.println("1. Кошку\n2. Собаку\n3. Волка\n4. Тигра\n5. Курицу\n6. Аиста");
                int animal = i.nextInt();
                System.out.println(animal);
                if (animal == 1) list.AddAnimal(new Cat());
                if (animal == 2) list.AddAnimal(new Dog());
                if (animal == 3) list.AddAnimal(new Wolf());
                if (animal == 4) list.AddAnimal(new Tiger());
                if (animal == 5) list.AddAnimal(new Chicken());
                if (animal == 6) list.AddAnimal(new Stork());
                
            }
            if (num == 2) list.DelAnimal();
            if (num == 3) list.getInfo();
            if (num == 4) list.getNois();
            if (num == 5) list.getInfoZOO();
            if (num == 6) list.getNoisZOO();
            if (num == 7) stop = true;
            
            Menu(stop, list);
            i.close();
        }
    }
}
