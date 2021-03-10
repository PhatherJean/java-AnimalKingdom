package animal;


public class Fish extends AbstractAnimals
{
	private String name;
	private int year;
	public Fish(String name, int year)
	{
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
	 	return "Swim";
	 }

	 @Override
	 public String getBreathe()
	 {
	 	return "Gills";
	 }

	 @Override
	 public String getReproduce()
	 {
	 	return "Eggs";
	 }

	 @Override
	public String toString()
	{
		return "Animals {id="+ id + ", name='" + name + "', yearNamed=" + year +"}";
	}

}