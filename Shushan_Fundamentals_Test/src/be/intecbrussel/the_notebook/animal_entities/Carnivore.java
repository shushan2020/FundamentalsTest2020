package be.intecbrussel.the_notebook.animal_entities;

public class Carnivore extends Animal {

	private double maxFoodSize;

	public Carnivore(String name) {
		super(name);
	}

	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);

	}

	public Carnivore(String name, double weight, double height, double length, double maxFoodSize) {
		super(name, weight, height, length);
		this.maxFoodSize = maxFoodSize;

	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	@Override
	public String toString() {

		return String.format("Animals [Carnivore[name=" + super.getName() + ", weight=" + super.getWeight() + "Kg "
				+ ", height=" + super.getHeight() + "M " + ", length=" + super.getLength() + "M " + ", maxFoodSize="
				+ maxFoodSize + "Kg " + "]");
	}

}
