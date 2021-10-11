package HomeWork6;

public class Animal {

    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal() {
    }
    public void catInfo() {
        System.out.println("Кот имя: " + name + ", цвет: " + color + ", лет: " + age);
    }

    public String run() {
      return "Животное бежит";
    }

    public void doRun() {
        System.out.println(run());
    }

    public String swim() {
        return "Животное плавает";
    }

    public void doSwim() {
        System.out.println(swim());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
