package HomeWork6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Рыжик", "Оранжевый", 3);
        Cat cat2 = new Cat("Борис", "Черный", 1);
        Dog dog1 = new Dog("Бобик", "Коричневый", 4);
        Dog dog2 = new Dog("Шарик", "Серый", 2);

        cat1.catInfo();
        cat1.doRun();
        cat1.doSwim();
        dog1.doRun();
        dog1.doSwim();
    }

}
