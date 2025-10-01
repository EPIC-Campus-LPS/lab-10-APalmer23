package part1;

public class FlowerBed {
	private Flower[] bed;

	public FlowerBed(Flower[] bed) {
		this.bed = bed;
	}

	public FlowerBed(int number) {
		bed = new Flower[number];
	}

	public Flower[] getBed() {
		return bed;
	}

	public void setBed(Flower[] b) {
		bed = b;
	}

	public int plantFlower(Flower f) {
		if (bed[0] == null && bed[1] == null) {
			bed[0] = f;
			return 0;
		}
		for (int i = 1; i < bed.length - 1; i++) {
			if (bed[i - 1] == null && bed[i] == null && bed[i + 1] == null) {
				bed[i] = f;
				return i;
			}
		}
		if (bed[bed.length - 1] == null && bed[bed.length - 2] == null) {
			bed[bed.length - 1] = f;
			return (bed.length - 1);
		}
		return -1;
	}

	Flower mem = new Flower("");

	public void flipBed() {
		for (int i = 0; i < bed.length / 2; i++) {
			mem = bed[i];
			bed[i] = bed[bed.length - 1 - i];
			bed[bed.length - 1 - i] = mem;
		}
	}

	public String toString() {
		String str = "FlowerBed{";
		for (int i = 0; i < bed.length - 1; i++) {
			str += bed[i] + ", ";
		}
		return str + bed[bed.length - 1] + "}";
	}
}
