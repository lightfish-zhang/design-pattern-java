public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
			System.out.println("please input two args");
			return;
        }
        try  {
         	UserDAO userDao=new UserDAO();
         	int permission=userDao.getPermission(args[0],args[1]);
            User user = UserFactory.getUser(permission);
            user.say();
            user.work();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
    }
}