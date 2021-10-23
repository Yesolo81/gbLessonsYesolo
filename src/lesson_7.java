package lesson7;

public class lesson_7 {
    public static void main(String[] args) {

        Plate firstPlate = new Plate(60);

        Cat[] catArray = new Cat[5];
        catArray[0] =  new Cat("Мотя", 60);
        catArray[1] =  new Cat("Рыжик", 10);
        catArray[2] =  new Cat("Васька", 40);
        catArray[3] =  new Cat("Уголек", 50);
        catArray[4] =  new Cat("Мурзик", 5);

        for (int i = 0; i < 5; i++) {

        firstPlate.plateInfo();
        firstPlate.addFood(10);
        firstPlate.plateInfo();
        catArray[i].eat(firstPlate);
        catArray[i].isCatFull();
        firstPlate.plateInfo();
            System.out.println();
        }


    }
}
