package HomeWork6;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String run() {
        return "Собака пробежала 300 метров";
    }

    @Override
    public String swim() {
        return "Собака проплыла 5 метров";
    }
}

