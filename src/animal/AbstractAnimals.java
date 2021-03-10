package animal;

abstract class AbstractAnimals
{
	protected int food;

	protected static int maxId = 0;
	protected int id;
	public String name;
	public int year;

	public AbstractAnimals()
	{
		food = 1;
		maxId++;
		id = maxId;
	}

	public AbstractAnimals(int food)
	{
		this.food = food;
	}

	abstract String getName();
	abstract int getYear();
	abstract String getMove();
	abstract String getBreathe();
	abstract String getReproduce();


	public void eatFood(int snack)
	{
		food = food + snack;
	}
}