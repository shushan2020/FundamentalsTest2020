package be.intecbrussel.the_notebook.plant_entities;

public class Plant {

	private String name;
	private double height;

	public Plant(String name) {
		this.name = name;
	}

	public Plant(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return String.format("Plant [name=" + name + ", height=" + height + "]");
	}

	

}
