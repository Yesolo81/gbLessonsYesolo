public class Animal {
    String name;

    Animal (String name) {
        this.name = name;

    }

    void run(int runDistance) {
        System.out.println(name + " пробежал " + runDistance + " м");
    }

    void swim(int swDistance) {
        System.out.println(name + " проплыл " + swDistance + " м");
    }

}
