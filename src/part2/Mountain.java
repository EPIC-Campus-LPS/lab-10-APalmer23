package part2;

public class Mountain {
	private String name;
	private int elevation;
	private double climbDifficulty;

	public Mountain(String name, int elevation, double climbDifficulty) {
		this.name = name;
		this.elevation = elevation;
		this.climbDifficulty = climbDifficulty;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getElevation() {
		return elevation;
	}

	public void setElevation(int e) {
		elevation = e;
	}

	public double getClimbDifficulty() {
		return climbDifficulty;
	}

	public void setClimbDifficulty(double cd) {
		climbDifficulty = cd;
	}

	public String toString() {
		return ("Montain{" + name + ", " + elevation + ", " + climbDifficulty + "}");
	}
}
