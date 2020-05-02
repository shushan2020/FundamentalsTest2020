package be.intecbrussel.the_notebook.plant_entities;

public class Bush extends Plant {

	private String fruit;
	private LeafType leafType;

	public Bush(String name) {
		super(name);

	}

	public Bush(String name, String fruit, double height) {
		super(name, height);
		this.fruit = fruit;

	}

	public Bush(String name, String fruit, double height, LeafType leafType) {
		super(name, height);
		this.fruit = fruit;
		this.leafType = leafType;

	}

	public String getFruit() {
		return fruit;
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {

		return String.format("Plant [Bush [Name=" + super.getName() + ", fruit=" + fruit + ", height="
				+ super.getHeight() + "Meter " + ", leafType=" + leafType + "]");
	}

}
