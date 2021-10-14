package HomeWork7;

import static java.lang.Thread.*;
import static java.lang.Thread.sleep;

public class HomeWorkApp7 {
    private static int TIME = 0;

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Барсик", false);
        Cat cat2 = new Cat("Мурка", false);
        Cat cat3 = new Cat("Рыжик", false);

        Plate plate = new Plate(50);

        System.out.println("Все коты голодны");

        plate.printInfo();

        while (plate.getFoodCount() > 10) {
            System.out.println("\n Коты поели");
            cat1.eat(plate);
            cat2.eat(plate);
            cat3.eat(plate);
            plate.printInfo();
            cat1.catInfo1();
            cat2.catInfo2();
            cat3.catInfo3();
            plate.addFood();
            TIME++;
            Thread.sleep(1000);
            if (TIME >= 5) {
                break;
            }
        }


        if (plate.getFoodCount() <= 15) {
            System.out.println("\n Еды не хватает");
        }
        System.out.println("\n Конец программы");


    }
}

