public class lesson1
{
    public static void main (String[] args)
    {
        printTheeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printTheeWords ()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign ()
    {
        int a = 500;
        int b = -500;
        if (a+b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor ()
    {
        int value = 100;
        if (value <= 0) System.out.println("Красный");
        else
            if (value > 0 && value <= 100) System.out.println("Желтый");
            else System.out.println("Зеленый");
    }

    public static void compareNumbers ()
    {
        int a = 11;
        int b = 10;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
