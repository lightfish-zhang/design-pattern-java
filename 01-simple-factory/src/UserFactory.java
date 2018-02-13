public class UserFactory
{
	public static User getUser(int permission)
	{
		if(0==permission)
		{
			return new Employee();
		}
		if(1==permission)
		{
			return new Manager();
		}
		if(2==permission)
		{
			return new Administrator();
		}

		return null;

	}
}