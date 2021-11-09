class KucingAdapter implements ToyDuck
{
	Kucing meow;
	public KucingAdapter(Kucing meow)
	{
		this.meow = meow;
	}

	public void squeak()
	{
		meow.makeSound();
	}
}