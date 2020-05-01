package be.intecbrussel.the_notebook.animal_entities;

import java.util.Set;

import be.intecbrussel.the_notebook.plant_entities.Plant;

public class Herbivore extends Animal {

	private Set<Plant> plantdiet;

	public Herbivore(String name) {
		super(name);
	}

	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantdiet() {
		return plantdiet;
	}

	public void setPlantdiet(Set<Plant> plantdiet) {
		this.plantdiet = plantdiet;
	}

	public void addPlantToDiet(Plant plant) {
		this.plantdiet.add(plant);

	}

	public void printDiet() {

	}

	@Override
	public String toString() {
		return "Herbivore [plantdiet=" + plantdiet + "]";
	}

}
