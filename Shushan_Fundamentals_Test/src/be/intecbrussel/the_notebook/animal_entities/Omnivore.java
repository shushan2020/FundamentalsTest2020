package be.intecbrussel.the_notebook.animal_entities;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.plant_entities.Plant;

public class Omnivore extends Animal {

	private Set<Plant> plantDiets=new HashSet<Plant>();
	private double maxFoodSize;

	public Omnivore(String name) {
		super(name);

	}

	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);

	}

	public Omnivore(String name, double weight, double height, double length, double maxFoodSize,
			Set<Plant> plantDiets) {
		super(name, weight, height, length);
		this.maxFoodSize = maxFoodSize;
		this.plantDiets = plantDiets;

	}

	public Set<Plant> getPlantdiet() {
		return plantDiets;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setPlantdiet(Set<Plant> plantdiet) {
		this.plantDiets = plantdiet;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	public void addPlantToDiet(Plant plant) {
		this.plantDiets.add(plant);
	}

	@Override
	public String toString() {

		return String.format("Animals [Omnivore[name=" + super.getName() + ", weight=" + super.getWeight()+ " Kg" + ", height="
				+ super.getHeight()+" M" + ", length=" + super.getLength() +" M"+ ", maxFoodSize=" + maxFoodSize+" Kg" +", plantDiets=" + plantDiets+ "]");
//		return String.format("Animals [Omnivore[name=" + super.getName() + ", weight=" + super.getWeight() + ", height="
//				+ super.getHeight() + ", length=" + super.getLength() + ", maxFoodSize=" + maxFoodSize + ", plantDiets="
//				+ plantDiets + "]");

	}

}
