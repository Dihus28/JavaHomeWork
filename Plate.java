package HomeWork7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Кол-во еды в миске: " + foodCount);
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFood() {
        if (foodCount <= 10) {
            foodCount += 30;
        }
    }


}
