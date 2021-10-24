import java.util.Random;
import java.util.Scanner;

public class lesson8_strings {

    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    static String result;

    public static void main(String[] args) {
// (в консоли) Создать массив из слов String[] words = {...};
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

// При запуске программы компьютер загадывает слово
        String aiWord = words[rand.nextInt(words.length)];
        String humanWord;
//        System.out.println(aiWord);

        do {
//        запрашивает ответ у пользователя,
            System.out.print("Ваш вариант слова: ");
            humanWord = sc.next();
            humanWord = makeEqual(aiWord, humanWord);

//        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
//        компьютер показывает буквы, которые стоят на своих местах.

            compare(aiWord, humanWord);
            System.out.println();


//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы
        } while (!aiWord.equals(humanWord));

        System.out.println("ВЕРНО!!!");

    }


    public static void compare (String inputWord, String wordToCompare) {

        String word = "";

        for (int index = 0; index < inputWord.length(); index++) {
            if (inputWord.charAt(index) == wordToCompare.charAt(index))
                result = String.valueOf(wordToCompare.charAt(index));
            else result = "•";
        word += result;
        }

        if (inputWord.length() < 15) {
            for (int index = 15; index > inputWord.length(); index--) {
                word += "•";
            }
        }

        System.out.println(word);
    }

    public static String makeEqual (String inputWord, String wordToCompare) {
        int inputWordLength = inputWord.length();
        //System.out.println(inputWordLength);
        int wordToCompareLength = wordToCompare.length();
        //System.out.println(wordToCompareLength);

        if (inputWordLength > wordToCompareLength) {
            for (int index = 0; index < inputWordLength - wordToCompareLength; index++) {
                wordToCompare += "•";
               // System.out.println(wordToCompare);
            }
        }
    return (wordToCompare);
    }


}
