package co.edu.poly;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accumulateRotation++;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " 한국 Tire수명" + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " 한국 Tire 펑크 ***");
			return false;
		}
	}
}
