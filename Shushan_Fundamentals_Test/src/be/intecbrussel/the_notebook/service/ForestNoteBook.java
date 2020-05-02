package be.intecbrussel.the_notebook.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;

import be.intecbrussel.the_notebook.plant_entities.Plant;

public class ForestNoteBook {

	private List<Carnivore> carnivores = new ArrayList<>();
	private List<Omnivore> omnivores = new ArrayList<>();;
	private List<Herbivore> herbivores = new ArrayList<>();;
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new ArrayList<Animal>();
	private List<Plant> plants = new ArrayList<Plant>();

	public ForestNoteBook() {

	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {
		// plants = new ArrayList<Plant>();
		// plantCount = (int) this.plants.stream().count();
		return plantCount = plants.size();
	}

	public int getAnimalCount() {
		return plantCount = animals.size();

	}

	// Adding Animal
	public void addAnimal(Animal animal) {
		addAnimalCheck(animal);
//		animals.add(animal);
//		if (animal instanceof Carnivore)
//			carnivores.add((Carnivore) animal);
//		else if (animal instanceof Herbivore)
//			herbivores.add((Herbivore) animal);
//		else
//			omnivores.add((Omnivore) animal);

	}

	public void addAnimalCheck(Animal animal) {

		if (animals.contains(animal))
			System.out.println("duplicate is not allowed");
		else {
			animals.add(animal);
			if (animal instanceof Carnivore)
				carnivores.add((Carnivore) animal);
			else if (animal instanceof Herbivore)
				herbivores.add((Herbivore) animal);
			else
				omnivores.add((Omnivore) animal);
		}
	}

	// Adding Plants
	public void addPlant(Plant plant) {

		this.plants.add(plant);

	}

	// Printing Printing Carnivore
	public void printCarnivores() {
		for (Animal animal : carnivores) {
			System.out.println(animal);
		}
	}

	// Printing Printing Herbivore
	public void printHerbivores() {
		for (Animal animal : herbivores) {
			System.out.println(animal);
		}
	}

	// Printing Printing Omnivore
	public void printOmnivores() {
		for (Animal animal : omnivores) {
			System.out.println(animal);
		}
	}

	// Printing Animals and Plants
	public void printNoteBook() {
		System.out.println("****Printing Animals****");
		for (Animal animal : animals) {
			System.out.println(animal);
		}

		System.out.println("****Printing Plants****");

		for (Plant plant : plants) {
			System.out.println(plant);
		}
		sortAnimalsByName();
		sortPlantsByName();

	}

	// Sorting Animals By Name
	public void sortAnimalsByName() {
		this.animals.stream().sorted(Comparator.comparing(Animal::getName)).forEach(System.out::println);

	}

	// Sorting Plants By Name
	public void sortPlantsByName() {
		this.plants.stream().sorted(Comparator.comparing(Plant::getName)).forEach(System.out::println);

	}

	// Sorting Animals By Height
	public void sortAnimalsByHeight() {
		this.animals.stream().sorted(Comparator.comparing(Animal::getHeight)).forEach(System.out::println);

	}

	// Sorting Plants By Name
	public void sortPlantsByHeight() {
		this.plants.stream().sorted(Comparator.comparing(Plant::getHeight)).forEach(System.out::println);

	}

	@Override
	public String toString() {
		return "ForestNoteBook [carnivores=" + carnivores + ", omnivores=" + omnivores + ", herbivores=" + herbivores
				+ ", plantCount=" + plantCount + ", animalCount=" + animalCount + ", animals=" + animals + ", plants="
				+ plants + "]";
	}

}
