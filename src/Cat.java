package lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean full;

    Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

   public void eat (Plate plate) {
       int i = plate.plateFood();
       plate.decrFood(appetite);
       if (i >= appetite) {
           System.out.println("Кот " + name + " съел " + appetite + " еды");
           this.full = true;
       }
       else System.out.println("Кот " + name + " хотел съесть " + appetite + " еды");

   }

    public void isCatFull () {
        if (this.full) System.out.println("Кот " + this.name + " наелся");
        else System.out.println("Кот " + this.name + " остался голодным");
    }

}
