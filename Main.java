// Java implementation of Adapter pattern
class Main
{
	public static void main(String args[])
	{
		Abu abu = new Abu();
		ToyDuck toyDuck = new PlasticToyDuck();
		ToyDuck KucingAdapter = new KucingAdapter(abu);

		System.out.print("Suara kucing abu...");
		abu.makeSound();

		System.out.print("Suara bebek mainan...");
		toyDuck.squeak();

		// toy duck suara kucing
		System.out.print("Suara bebek jadi - jadian...");
		KucingAdapter.squeak();
	}
}
