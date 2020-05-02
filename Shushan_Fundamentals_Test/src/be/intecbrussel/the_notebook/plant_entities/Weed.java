package be.intecbrussel.the_notebook.plant_entities;

public class Weed extends Plant {

	private double area;

	public Weed(String name) {
		super(name);

	}

	// this constructor contains property of super class Plant and property of
	// Weed plant
	public Weed(String name, double height, double area) {
		super(name, height);
		this.area = area;

	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {

		return String.format("Plant [Weed [Name=" + super.getName() + ", height=" + super.getHeight() + "Meter "
				+ ", area=" + area + "squareMeter " + "]");

	}

}
