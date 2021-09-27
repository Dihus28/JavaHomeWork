package HomeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        consoleInput();
    }

    // Задание 1
    public static void invertArray() {
        int[] arr = {1, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 2
    public static void fillArray() {
        int[] arr = new int[100];
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 3
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 4
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n++;
                arr[0][0] = 1;
                arr[1][1] = 1;
                arr[2][2] = 1;
                arr[3][3] = 1;
                arr[4][4] = 1;
                arr[4][0] = 1;
                arr[3][1] = 1;
                arr[2][2] = 1;
                arr[1][3] = 1;
                arr[0][4] = 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
    //Задание 5
    public static void consoleInput(){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int initialValue = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
        arr[i]=initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}

