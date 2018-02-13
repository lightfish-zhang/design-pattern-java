public class Employee extends User
{
	public Employee()
	{
		System.out.println("Employee appear");
	}
    
    @Override
    public void say()
	{
		System.out.println("i am a employee");
	}

	public void work()
	{
		System.out.println("go to work");
	}
}