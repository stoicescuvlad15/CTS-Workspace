package ro.ase.cts.week2.interest;

public interface Profitable {	// all the fields are final by default
	public static float MAX_INTEREST_PERCENT = 5;

	public abstract void addInterest(float interestPercent);
}
