package Less_7;

public class Cat extends Animals{

    private static int catCount = 0;
    private boolean isHungry;

    public Cat(String name) {
        super(name, 200, 0); // Кошки не умеют плавать
        catCount++;
        this.isHungry = true; // Кошка изначально голодна
    }

    public boolean eat(Bowl bowl) {
        if (bowl.getFoodAmount() > 0) {
            bowl.decreaseFood();
            this.isHungry = false;
            System.out.println(name + " поел из миски.");
            return true;
        } else {
            System.out.println("Миска пуста, " + name + " не может поесть.");
            return false;
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    public static int getCatCount() {
        return catCount;
    }
}
