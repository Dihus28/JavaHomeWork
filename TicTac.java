package test;

import java.util.Random;
import java.util.Scanner;

public class TicTac {
    static final int SIZE = 3;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final String HEADER_FIRST_SYMBOL = "▬";
    static final String SPACE_MAP = " ";

    static final char[][] MAP = new char[SIZE][SIZE];
    static final Random random = new Random();
    static final Scanner in = new Scanner(System.in);
    static int turnsCount;

    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        do {
            System.out.println("\n\nНовая игра");
            initMap();
            printMap();
            playGame();
        } while (isContinueGame());
            endGame();
    }

    private static void endGame() {
        System.out.println("Конец игры");
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y", "yes", "+", "да" -> true;
            default -> false;
        };
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            AIturn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nПобеда человека");
            } else {
                System.out.println("\nПобеда компьютера");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("\nНичья");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        return turnsCount == SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {
        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private static void AIturn() {
        System.out.println("\nХод компьютера");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }


    private static void humanTurn() {
        System.out.println("\nХод человека");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = getValidNumber() - 1;
            columnNumber = getValidNumber() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            } else {
                System.out.println("\nЯчейка занята");
            }
        } while (true);

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static int getValidNumber() {
        do {
            System.out.print("Делайте ход: ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    System.out.println("Ход " + n + " принят\n");
                    return n;
                }
                System.out.println("\nВвод только от 1 до " + SIZE);
            } else {
                System.out.println("\n Вводи только числа");
                in.next();
            }
        } while (true);
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();

    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }
}
