package tentenCafeteria.src.main.java.entity;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private String foodType;
    private String foodName;
    List<String> ingredients = new ArrayList<>();

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}