public class Main
{
	public static void main(String a[])
	{
		Color color;
		Pen pen;
		
		color=(Color)XMLUtil.getBean("color");
		pen=(Pen)XMLUtil.getBean("pen");
		
		pen.setColor(color);
		pen.draw("鲜花");
	}
}