import java.util.Arrays;

public class lesson3 {
    public static void main (String args[]) {

        firstArray();
        secondArray();
        thirdArray();
        forthArray();
        fifthArray(5, 5);
        sixArray();
        int[] sevenArr = {26,4,-2,0,8,20};
        System.out.println(seventhArray(sevenArr));
        System.out.println();
        int move = -5;
        int[] array8 = {1,2,3,4,5,6,7,8,9,10,11,12};
        eightArray(array8, move);
    }


    //Задание 1
    static void firstArray() {
        int[] arr = {1,0,1,1,1,0,1,0,0};
        System.out.println(Arrays.toString(arr) + " - исходный массив");
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == 1) arr[i] = 0;
          else arr[i] = 1;
      }
        System.out.println(Arrays.toString(arr) + " - преобразованный массив");
        System.out.println();
    }

   //Задание 2
    static void secondArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) arr[i] = i+1;
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    //Задание 3
    static void thirdArray() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) if (arr[i] < 6) arr[i] *= 2;
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

   //Задание 4
    static void forthArray() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr[0].length; i++) {
            arr[i][i] = 1;
            arr[i][arr[0].length-1-i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }

    //Задание 5
    static void fifthArray(int len, int initValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = initValue;
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    //Задание 6
    static void sixArray () {
       int[] arr = {4, 0, -3, 9, -5, -3, -10};
       int min = arr[0];
       int max = arr[0];
       for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
       }
        System.out.println("min: " + min + ", max: " + max);
        System.out.println();
    }

    //Задание 7
    static boolean seventhArray(int[] arr){
       int[] arrDirect = new int[arr.length-1]; //Массив последовательного сложения слева-направо
       int[] arrBack = new int[arr.length-1];  //Массив последовательного сложения справа-налево
       boolean result = false;
       int element; //Индекс элемента на котором сумма справа равна сумме слева
       arrDirect[0] = arr[0];
       arrBack[arrBack.length-1] = arr[arr.length-1];
       for (int i = 1; i < arr.length - 1; i++) {
           arrDirect[i] = arrDirect[i - 1] + arr[i];
           arrBack[arrBack.length-1-i] = arrBack[arrBack.length-i] + arr[arr.length-1-i];
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arrDirect));
        //System.out.println(Arrays.toString(arrBack));
       for (int j = 0; j < arrDirect.length; j++)
           if (arrDirect[j] == arrBack[j]) {
               result = true;
               element = j+1;
               System.out.println("Parts are equal at " + element + "th element");
           }
        return (result);
    }

   //Задание 8
    static void eightArray (int[] arr, int move){
        int buffer1; // буфер
        int i; // счетчик

        if (Math.abs(move) > arr.length) move %= arr.length; // пересчет сдвига, если он больше длины массива
        System.out.println(Arrays.toString(arr) + " - исходный массив");

        if (move == 0) move = arr.length; // если сдвиг = 0, то исходный массив не меняется

        // сдвиг вправо
        if (move >0) {
            for (int k = 0; k < move; k++) { //цикл повтора единичного сдвига
                for (i = k; i < arr.length - 1; i++) { //цикл сдвига на 1
                    buffer1 = arr[i + 1];
                    arr[i + 1] = arr[k];
                    arr[k] = buffer1;
                }
            }
            for (int k = 0; k < move / 2; k++) { //обратный цикл пересчета значений массива
                buffer1 = arr[k];
                arr[k] = arr[move - 1 - k];
                arr[move - 1 - k] = buffer1;
            }
        }

        //сдвил влево
        if (move <0) {
            int move1 = Math.abs(move);
            for (int k = arr.length-1; k > arr.length-1-move1; k--) { //цикл повтора единичного сдвига
                for (i = k; i > 0; i--) { //цикл повтора единичного сдвига
                    buffer1 = arr[i - 1];
                    arr[i - 1] = arr[k];
                    arr[k] = buffer1;
                }
            }
            for (int k = 0; k < move1 / 2; k++) { //обратный цикл пересчета значений массива
                buffer1 = arr[arr.length - 1 - k];
                arr[arr.length - 1 - k] = arr[arr.length - move1 + k];
                arr[arr.length - move1 + k] = buffer1;
            }
        }
        System.out.println(Arrays.toString(arr) + " - новый массив");
    }
}
