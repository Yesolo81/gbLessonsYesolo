public class Dog extends Animal {

    Dog (String name) {
        super(name);
    }

    @Override
    void run(int runDistance) {
        if (runDistance > 500)
            System.out.println("Пес " + name + " пробежал 500 м");
            else System.out.println("Пес " + name + " пробежал " + runDistance + " м");

    }

    @Override
    void swim(int swDistance) {
        if (swDistance > 10)
            System.out.println("Пес " + name + " проплыл 10 м");
        else System.out.println("Пес " + name + " проплыл " + swDistance + " м");

    }
}
