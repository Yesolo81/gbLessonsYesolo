public class lesson2 {

    public static void main (String[] args){
        System.out.println(twoNumbersSum(5,17));
        System.out.println(positiveOrNegative(0));
        System.out.println(posOrNeg(0));
        printStringSevTies("Hello", 5);
        System.out.println(longYear(1996));
    }

    public static boolean twoNumbersSum(int a, int b){
        return (a+b >= 10 && a+b <= 20);
    }

    public static String positiveOrNegative(int a){
        if (a<0) return("Число отрицательне");
        else return ("Число положительное");
    }

    public static boolean posOrNeg(int a){
        return (a<0);
    }

    public static void printStringSevTies (String a, int b){
        for (int i = 0; i < b; i++) System.out.println(a);
    }

    public static boolean longYear (int a){
        return (a%4 == 0 || a%400 == 0);
    }

}
