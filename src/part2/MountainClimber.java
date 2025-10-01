package part2;

public class MountainClimber {
	private Mountain[] wantToClimb;

	public MountainClimber(Mountain[] wantToClimb) {
		this.wantToClimb = wantToClimb;
	}

	public Mountain[] getWantToClimb() {
		return wantToClimb;
	}

	public void setWantToClimb(Mountain[] c) {
		wantToClimb = c;
	}

	public Mountain mostDifficultClimb() {
		Mountain diff = new Mountain("", 0, 0);
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getClimbDifficulty() > diff.getClimbDifficulty()) {
				diff.setName(wantToClimb[i].getName());
				diff.setElevation(wantToClimb[i].getElevation());
				diff.setClimbDifficulty(wantToClimb[i].getClimbDifficulty());
			}
		}
		return diff;
	}

	public void sortClimbLowToHigh() {
		Mountain hold;
		for (int i = 0; i < wantToClimb.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < wantToClimb.length; j++) {
				if (wantToClimb[j].getClimbDifficulty() < wantToClimb[min].getClimbDifficulty())
					min = j;
			}
			hold = wantToClimb[min];
			wantToClimb[min] = wantToClimb[i];
			wantToClimb[i] = hold;
		}
	}

	public void sortClimbHighToLow() {
		Mountain hold;
		for (int i = 0; i < wantToClimb.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < wantToClimb.length; j++) {
				if (wantToClimb[j].getClimbDifficulty() > wantToClimb[max].getClimbDifficulty())
					max = j;
			}
			hold = wantToClimb[max];
			wantToClimb[max] = wantToClimb[i];
			wantToClimb[i] = hold;
		}
	}

	public MountainClimber getFourteeners() {
		int count = 0;
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getElevation() > 14000)
				count++;
		}
		Mountain[] fourteen = new Mountain[count];
		int j = 0;
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getElevation() > 14000) {
				fourteen[j] = wantToClimb[i];
				j++;
			}
		}
		MountainClimber fourteeners = new MountainClimber(fourteen);
		return fourteeners;
	}

	public String toString() {
		String str = "MountainClimber{";
		for (int i = 0; i < wantToClimb.length - 1; i++) {
			str += wantToClimb[i] + ", ";
		}
		return (str + wantToClimb[wantToClimb.length - 1] + "}");
	}
}
