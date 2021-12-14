public class SmartStrategy implements OrderingStrategy {
    boolean happy;
    StringDrink drinkWanted;
    StringRecipe recipeWanted;
    StringBar barWanted;
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            recipe.mix(drink);
        }
        else{
            this.drinkWanted = drink;
            this.recipeWanted = recipe;
            this.barWanted = bar;
        }
    }

    public void happyHourStarted(StringBar bar) {
        wants(drinkWanted,recipeWanted,barWanted);
    }

    public void happyHourEnded(StringBar bar) {
    }
}
