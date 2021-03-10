package animal;

public class Mammal extends AbstractAnimals
{
	private String name;
	private int year;

	public Mammal(String name, int year)
	{
		//super(food) is passed in under the hood
		this.name = name;
		this.year = year;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	@Override
	public String getMove()
	{
		return "Walk";
	} 

	@Override
	public String getBreathe()
	{
		return "Lungs";
	}

	@Override
	public String getReproduce()
	{
		return "Live Births";
	}

	@Override
	public String toString()
	{
		return "Animals {id="+ id + ", name='" + name + "', yearNamed=" + year +"}";
	}
}