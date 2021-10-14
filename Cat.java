package HomeWork7;

import java.util.Random;

public class Cat {
    private String name;
    private final Random random = new Random();
    public boolean catFill;

    public Cat(String name, boolean catFill) {
        this.name = name;
        this.catFill = catFill;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(random.nextInt(4) + 3);
        catFill = true;
        if (plate.getFoodCount() < 4) {
            catFill = false;
        }
    }


    public void catInfo1() {
        System.out.println("Барсик сыт? " + catFill);
    }
    public void catInfo2() {
        System.out.println("Мурка сыт? " + catFill);
    }
    public void catInfo3() {
        System.out.println("Рыжик сыт? " + catFill);
    }
}
