package be.intecbrussel.the_notebook.plant_entities;

public class Flower extends Plant {

	private Scent smell;

	public Flower(String name) {
		super(name);

	}

	public Flower(String name, double height, Scent smell) {
		super(name, height);
		this.smell = smell;
	}

	public Scent getSmell() {
		return smell;
	}

	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	@Override
	public String toString() {

		return String.format("Plant [Flower [Name=" + super.getName() + ", height=" + super.getHeight() + "Meter "
				+ ", smell=" + smell + "]");
	}

}
