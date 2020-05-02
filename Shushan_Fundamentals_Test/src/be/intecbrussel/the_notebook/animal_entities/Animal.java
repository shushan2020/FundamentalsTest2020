package be.intecbrussel.the_notebook.animal_entities;

public class Animal {

	private String name;
	private double weight;
	private double height;
	private double length;

	public Animal(String name) {
		this.name = name;
	}

	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getLength() {
		return length;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Animals [name=" + name + ", weight=" + weight + ", height=" + height + ", length=" + length + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
