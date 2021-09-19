package HomeWork;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 5;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else if ((a + b) <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
         int value = 28;
        if (value <= 0) {
             System.out.println("Красный");
         }
         else if (value >0 && value <=100 ) {
            System.out.println("Желтый");
        }
         else if (value >100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a =53;
        int b = 65;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
