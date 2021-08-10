import java.util.Random;
import java.util.Scanner;
public class lesson4 {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static int exit;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
    do {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Сыграть еще? 1 - Да");
        exit = sc.nextInt();
    } while (exit == 1);
    }

    public static boolean checkWin(char symb) {

        int k;
         for (int i = 0; i < SIZE; i++) {
             k = 0;
             for (int j = 0; j < SIZE; j++)
                 if (map[i][j] == symb) k++;
             if (k == DOTS_TO_WIN) return true;
         }

        for (int i = 0; i < SIZE; i++) {
            k = 0;
            for (int j = 0; j < SIZE; j++)
                if (map[j][i] == symb) k++;
            if (k == DOTS_TO_WIN) return true;
        }

        k = 0;
        for (int i = 0; i < SIZE; i++)
            if (map[i][i] == symb) k++;
            if (k == DOTS_TO_WIN) return true;

        k = 0;
        for (int i = 0; i < SIZE; i++)
            if (map[i][SIZE - 1 -i] == symb) k++;
            if (k == DOTS_TO_WIN) return true;

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;

        int k; //счетчик ходов игрока в линии
        int s; //метка свободной ячейки в линии
        boolean fix; //метка ячейки для хода AI


        do {
            x = rand.nextInt(SIZE); // координаты хода AI при отсутствии опасности
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));

        for (int i = 0; i < SIZE; i++) { //проверка опасности по горизонтали
            k = 0;
            s = -1;
            fix = false;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X) k++;
                if (map[i][j] == DOT_EMPTY) s = j;
                if (k == DOTS_TO_WIN - 1 && s > -1) {
                    x = s;
                    y = i;
                    fix = true;
                    break;
                }
            }
            if (fix) break;
        }

        for (int j = 0; j < SIZE; j++) { //проверка опасности по вертикали
            k = 0;
            s = -1;
            fix = false;

            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] == DOT_X) k++;
                if (map[i][j] == DOT_EMPTY) s = i;
                if (k == DOTS_TO_WIN - 1 && s > -1) {
                    x = j;
                    y = s;
                    fix = true;
                    break;
                }
            }
            if (fix) break;
        }

        k = 0;
        s = -1;
        fix = false;

        for (int i = 0; i < SIZE; i++) { //проверка опасности по главной диагонали

                if (map[i][i] == DOT_X) k++;
                if (map[i][i] == DOT_EMPTY) s = i;
                if (k == DOTS_TO_WIN - 1 && s > -1) {
                    x = s;
                    y = s;
                    fix = true;
                }

            if (fix) break;
        }

        k = 0;
        s = -1;
        fix = false;

        for (int i = 0; i < SIZE; i++) { //проверка опасности по второстепенной диагонали

            if (map[i][SIZE - 1 - i] == DOT_X) k++;
            if (map[i][SIZE - 1 - i] == DOT_EMPTY) s = i;
            if (k == DOTS_TO_WIN - 1 && s > -1) {
                x = SIZE - 1 - s;
                y = s;
                fix = true;
            }

            if (fix) break;
        }


        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


