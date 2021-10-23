public class lesson61 {
    public static void main (String[] args) {

        int j=0;
        int k=0;
        int swimDist = 100;
        int runDist = 800;

        Animal[] anArray = new Animal[5];
        anArray[0] =  new Animal("Олень");
        anArray[1] =  new Dog("Тузик");
        anArray[2] =  new Dog("Полкан");
        anArray[3] =  new Cat("Мотя");
        anArray[4] =  new Cat("Мурзик");

        for (int i = 0; i < 5; i++) {
            if (anArray[i] instanceof Dog) {
                j++;
            }
            if (anArray[i] instanceof Cat) {
                k++;
            }
            anArray[i].run(runDist);
            anArray[i].swim(swimDist);
            System.out.println();
        }
        System.out.println("Всего было 5 животных. Из них: " + j + " собаки и " + k + " кошки.");

    }
}
