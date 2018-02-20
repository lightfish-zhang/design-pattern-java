public abstract class MealBuilder
{
    /* 
    在C++中类是完全抽象的，不可以在类中对变量直接进行初始化。在 Java中可以直接对类对象直接赋值了。
使用这种方法，在定义变量的同时直接对类成员进行了初始化，不需要借用构造方法。这种赋值的方法适用于那些被认为不可变的成员，例如常量。
    */
    protected Meal meal = new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal(){
        return meal;
    }
}