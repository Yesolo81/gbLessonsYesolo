package lesson7;

public class Plate {

    private int food;
    Plate (int food) {
        this.food = food;
    }

    public void addFood (int addFood) {
        this.food += addFood;
        System.out.println("В тарелку добавили " + addFood + " еды");
    }

    public void decrFood (int decrFood) {
        if (this.food >= decrFood) this.food -= decrFood;

    }

    public int plateFood () {
        return (this.food);
    }

    public void plateInfo () {
        System.out.println("В тарелке " + this.food + " еды");
    }
}
