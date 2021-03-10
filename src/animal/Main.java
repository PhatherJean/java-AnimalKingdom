package animal;

import java.util.List;
import java.util.ArrayList;

public class Main
{
	private static List<AbstractAnimals> filterAnimals(List<AbstractAnimals> theList, CheckAnimal tester)
	{
		List<AbstractAnimals> tempList = new ArrayList<>();

		for(AbstractAnimals v : theList)
		{
			if (tester.test(v))
			{
				tempList.add(v);
			}
		}
		return tempList;
	}

	public static void main(String[] args)
	{
		System.out.println("Represent the Animal Kingdom");
		System.out.println();

		System.out.println("\n*** All of the animals ***");


		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Big Foot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot",1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<AbstractAnimals> myList = new ArrayList<>();
		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);
		for(AbstractAnimals a: myList)
		{
			System.out.println(a);
		}
		//System.out.println(myList);
		System.out.println("\n MVP Tasks \n\n");

		System.out.println("\n*** List animals in descending order by year named ***\n");
		myList.sort((v1, v2) -> v2.getYear() - v1.getYear());
		myList.forEach((v) -> System.out.println(v));

		System.out.println("\n *** List all animals alphabetically*** \n");
		myList.sort((v1,v2)-> v1.getName().compareToIgnoreCase(v2.getName()));
		myList.forEach((v)-> System.out.println(v));

		System.out.println("\n *** List all the animals order by how they move ***\n");
		myList.sort((v1,v2)-> v1.getMove().compareToIgnoreCase(v2.getMove()));
		myList.forEach((v)-> System.out.println(v));

		System.out.println("\n*** List all animals that breathe with lungs ***\n ");
		List<AbstractAnimals> filteredList = new ArrayList<>();
		filteredList = filterAnimals(myList, (v) -> (v.getBreathe() == "Lungs"));
		filteredList.forEach((v)-> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreathe() + " " + v.getYear()));

		System.out.println("\n *** List only animals that breathe with lungs and were named in the year 1758 ***\n");
		filteredList = filterAnimals(myList, (v)-> (v.getBreathe() == "Lungs")&&(v.getYear() == 1758));
		filteredList.forEach((v)-> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreathe() + " " + v.getYear()));
		
		System.out.println("\n *** List only animals that lay eggs and breathe with lungs ***\n");
		filteredList = filterAnimals(myList, (v)-> (v.getBreathe() == "Lungs")&&(v.getReproduce() == "Eggs"));
		filteredList.forEach((v)-> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreathe() + " " + v.getYear()));	
		
		System.out.println("\n *** List alphabetically only those animals that were named in 1758 ***\n");
		filteredList = filterAnimals(myList, (v)-> (v.getYear()==1758));
		filteredList.sort((v1,v2)-> v1.getName().compareToIgnoreCase(v2.getName()));
		filteredList.forEach((v)-> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreathe() + " " + v.getYear()));
		System.out.println("\n\n *** MVP Tasks Completed *** \n\n");

		System.out.println("*** Stretch Goal ***\n\n");
		System.out.println("*** For the list of animals, list alphabetically those animals that are mammals *** \n");
		filteredList = filterAnimals(myList, (v) -> (v instanceof Mammal));
		filteredList.forEach((v)-> System.out.println(v.getName()+ " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreathe() + " " + v.getYear()));
	}	
}