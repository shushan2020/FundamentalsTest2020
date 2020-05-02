package be.intecbrussel.the_notebook.animal_entities;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.plant_entities.Plant;

public class Herbivore extends Animal {

	private Set<Plant> plantDiets = new HashSet<Plant>();

	public Herbivore(String name) {
		super(name);
	}

	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Herbivore(String name, double weight, double height, double length, Set<Plant> plantDiets) {
		super(name, weight, height, length);
		this.plantDiets = plantDiets;
	}

	public Set<Plant> getPlantdiet() {
		return plantDiets;
	}

	public void setPlantdiet(Set<Plant> plantdiet) {
		this.plantDiets = plantdiet;
	}

	public void addPlantToDiet(Plant plant) {
		this.plantDiets.add(plant);

	}

	public void printDiet() {
		for (Plant plant : plantDiets) {
			System.out.println(plant);
		}

	}

	@Override
	public String toString() {

		return String.format("Animals [Herbivore[name=" + super.getName() + ", weight=" + super.getWeight() + "Kg "
				+ ", height=" + super.getHeight() + "M " + ", length=" + super.getLength() + "M " + ", plantDiets="
				+ plantDiets + "]");
	}

}
