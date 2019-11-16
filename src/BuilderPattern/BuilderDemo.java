package BuilderPattern;

public class BuilderDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Veh Meal total cost: "+vegMeal.getCost());


        Meal nonVehMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVehMeal.showItems();
        System.out.println(" Non Veg Meal total cost: "+nonVehMeal.getCost());
    }
}
