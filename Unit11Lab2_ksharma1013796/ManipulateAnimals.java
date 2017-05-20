package APClass;

public class ManipulateAnimals 
{
	public static void main(String args [])
	{
		AllActions [] all = { new  Vehicle(), new Vehicle(), new Animal(), new Animal()};
		for (int i = 0; i < all.length; i++)
		{
			all[i].drawObject();
			all[i].resizeObject();
			all[i].rotateObject();
			all[i].playSound();
		}
	}
}
