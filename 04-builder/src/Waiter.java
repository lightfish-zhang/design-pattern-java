public class Waiter{
    private MealBuilder mb;
    public void setMealBuilder(MealBuilder mb){
        this.mb = mb;
    }
    public Meal build(){
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}