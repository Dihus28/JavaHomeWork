package HomeWork2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        CheckSum10to20(5, 9);
        System.out.println(CheckSum10to20(5, 9));
        PositiveNegative(0);
        PositiveNegativeNumber(28);
        System.out.println(PositiveNegativeNumber(28));
        printString("GeekBrains", 0);
        CheckYear(1600);
        System.out.println(CheckYear(1595));
    }
// Задание 1
    public static boolean CheckSum10to20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }
// Задание 2
    public static void PositiveNegative(int c) {
        if (c >= 0) {
            System.out.println("Число Положительное");
        } else {
            System.out.println("Число Отрицательное");
        }
    }
// Задание 3
    public static boolean PositiveNegativeNumber (int d){
        if (d<0){
            return true;
        }
        return false;
    }
//Задание 4
    public static void printString(String word, int times) {
        for (times = 0; times < 5; times++) {
            System.out.println(word);
        }
    }

    public static boolean CheckYear(int a) {
        if (((a%4==1)&&(a%100==0))||(a%400==0))
        {
            return true;
        }
        return false;
    }
}




