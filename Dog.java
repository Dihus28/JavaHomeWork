package HomeWork6;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String run() {
        return "Кот пробежал 100 метров";
    }

    @Override
    public String swim() {
        return "Кот не плавает";
    }
}
