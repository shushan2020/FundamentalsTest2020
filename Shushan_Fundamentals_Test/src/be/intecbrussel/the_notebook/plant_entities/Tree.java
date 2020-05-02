package be.intecbrussel.the_notebook.plant_entities;

public class Tree extends Plant {

	private LeafType leafType;

	public Tree(String name) {
		super(name);
	}

	// this constructor contains property of super class Plant and property of
	// Tree plant
	public Tree(String name, double height, LeafType leafType) {
		super(name, height);
		this.leafType = leafType;

	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {

		return String.format("Plant [Tree [Name=" + super.getName() + ", height=" + super.getHeight() + "Meter "
				+ ", leafType=" + leafType + "]");

	}

}
