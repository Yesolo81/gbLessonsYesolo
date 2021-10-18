public class Cat extends Animal{

    Cat (String name) {
        super(name);
    }

    @Override
    void run(int runDistance) {
        if (runDistance > 200)
            System.out.println("Кот " + name + " пробежал 200 м");
        else System.out.println("Кот " + name + " пробежал " + runDistance + " м");

    }

    @Override
    void swim(int swDistance) {
                    System.out.println("Кот " + name + " утонул :(");

    }
}
