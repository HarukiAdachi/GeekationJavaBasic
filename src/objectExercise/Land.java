package objectExercise;

public class Land extends Property {

	private String spaciousness;

	public Land(String name, String have, String kind, int price, String spaciousness) {
		super(name, have, kind, price);
		this.spaciousness = spaciousness;
	}

	public String getSpaciousness() {
		return spaciousness;
	}

	public void setSpaciousness(String spaciousness) {
		this.spaciousness = spaciousness;
	}

	public void printAll() {
		printHeader();

		printData();

		System.out.println("間取り : " + spaciousness);

		printHooder();
	}

}
