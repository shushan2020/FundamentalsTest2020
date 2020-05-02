package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Bush;
import be.intecbrussel.the_notebook.plant_entities.Flower;
import be.intecbrussel.the_notebook.plant_entities.LeafType;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import be.intecbrussel.the_notebook.plant_entities.Scent;
import be.intecbrussel.the_notebook.plant_entities.Tree;
import be.intecbrussel.the_notebook.plant_entities.Weed;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp {

	public static void main(String[] args) {
		ForestNoteBook forestNoteBook = new ForestNoteBook();
		// Creating Plant
		Plant blackthorn = new Bush("blackthorn", "dark fruit", 6, LeafType.ROUND);
		Plant flower = new Flower("Sunflower", 3, Scent.SWEET);
		Plant weed = new Weed("Crabgrass", 120, 200);
		Plant tree = new Tree("Aspen", 2, LeafType.HEART);
		Plant broom = new Bush("Broom", "sweet broom", 12, LeafType.SPEAR);
		// Adding to PlantDiet
		System.out.println("***Printing Plant Diet***\n");
		Herbivore plantDiet = new Herbivore("plantDiet");
		plantDiet.addPlantToDiet(flower);
		plantDiet.addPlantToDiet(broom);
		plantDiet.addPlantToDiet(tree);
		plantDiet.addPlantToDiet(weed);
		plantDiet.addPlantToDiet(blackthorn);
		plantDiet.printDiet();
		System.out.println("======================================================\n");
		// Adding Animals
		forestNoteBook.addAnimal(new Carnivore("Lion", 300, 1.5, 1.6, 150));
		forestNoteBook.addAnimal(new Omnivore("Bears", 150, 1.78, 1, 300, plantDiet.getPlantdiet()));
		forestNoteBook.addAnimal(new Carnivore("Hyna", 150, 1.4, 1.2, 80));
		forestNoteBook.addAnimal(new Herbivore("Deer", 120, 1.3, 1.5, plantDiet.getPlantdiet()));
		forestNoteBook.addAnimal(new Omnivore("Scavenger", 100, 1.2, 1.3, 90, plantDiet.getPlantdiet()));
		forestNoteBook.addAnimal(new Carnivore("Leopard", 200, 1.5, 1.4, 100));
		forestNoteBook.addAnimal(new Herbivore("Giraff", 400, 2.5, 1.7, plantDiet.getPlantdiet()));
		forestNoteBook.addAnimal(new Carnivore("Wolf", 150, 1.7, 1.6, 90));
		forestNoteBook.addAnimal(new Carnivore("Cheetah", 250, 1.5, 1.6, 100));
		forestNoteBook.addAnimal(new Omnivore("Scavenger", 300, 1.2, 1.3, 90, plantDiet.getPlantdiet()));
		System.out.println("======================================================\n");
		// Adding Plants
		forestNoteBook.addPlant(new Bush("Dogwood", "berries", 12, LeafType.SPEAR));
		forestNoteBook.addPlant(new Bush("Blackthorn", "dark fruit", 6, LeafType.ROUND));
		forestNoteBook.addPlant(new Flower("Sunflower", 3, Scent.SWEET));
		forestNoteBook.addPlant(new Weed("Crabgrass", 120, 200));
		forestNoteBook.addPlant(new Tree("Aspen", 2, LeafType.HEART));
		forestNoteBook.addPlant(new Bush("Rose", " rose", 7, LeafType.NEEDLE));
		forestNoteBook.addPlant(new Bush("Dogwood", "berries", 12, LeafType.SPEAR));
		// Printing Animals and Plants
		forestNoteBook.printNoteBook();
		System.out.println("======================================================\n");

		System.out.println(" printing carnivores\n");
		forestNoteBook.printCarnivores();
		System.out.println("======================================================\n");

		System.out.println(" printing Herbivore\n");
		forestNoteBook.printHerbivores();
		System.out.println("======================================================\n");

		System.out.println(" printing Omnivores\n");
		forestNoteBook.printOmnivores();
		System.out.println("======================================================\n");
		// Print the count of Animals and Plants
		System.out.println("the number of animals : " + forestNoteBook.getAnimalCount() + "\n"
				+ "the number of plants : " + forestNoteBook.getPlantCount());
		System.out.println("==========================================================\n");
		System.out.println("***sorted Animals by name***\n");
		forestNoteBook.sortAnimalsByName();
		System.out.println("==========================================================\n");
		System.out.println("***Sorting plants by Name***\n");
		forestNoteBook.sortPlantsByName();
		System.out.println("==========================================================\n");
		System.out.println("***sorting animals by height***\n");
		forestNoteBook.sortAnimalsByHeight();
		System.out.println("==========================================================\n");
		System.out.println("***sorting Plants by height***\n");
		forestNoteBook.sortPlantsByHeight();
		System.out.println("==========================================================\n");

	}

}
