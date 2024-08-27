package Less_7;

public class Bowl {
//Класс миска с едой
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void decreaseFood() {
        if (foodAmount > 0) {
            foodAmount--;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int food) {//Метод для добавления еды в миску
        if (food > 0) {
            foodAmount += food;
        }
    }
}
