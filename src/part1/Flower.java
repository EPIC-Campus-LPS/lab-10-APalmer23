package part1;

public class Flower {
	private String species;

	public Flower(String species) {
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String s) {
		species = s;
	}

	public String toString() {
		return "Flower{" + species + "}";
	}
}
