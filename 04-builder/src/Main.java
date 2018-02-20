public class Main
{
    public static void main(String args[]){
        try{
            // 指挥者
            Waiter waiter = new Waiter();
            // 确定工具种类
            MealBuilder mb = (MealBuilder)XMLUtil.getBean();
            // 使用工具制造产品
            waiter.setMealBuilder(mb);
            Meal meal  = waiter.build();

            System.out.printf("您的套餐来了，主食：%s, 饮料：%s\n", meal.getFood(), meal.getDrink());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}