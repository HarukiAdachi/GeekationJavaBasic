package objectExercise;

public class Apartment extends Property {

	private String FloorPlan;

	public Apartment(String name, String have, String kind, int price, String FloorPlan) {
		super(name, have, kind, price);
		this.FloorPlan = FloorPlan;

	}

	public String getFloorPlan() {
		return FloorPlan;
	}

	public void setFloorPlan(String floorPlan) {
		FloorPlan = floorPlan;
	}

	public void printAll() {
		printHeader();
		
		printData();
		
		System.out.println("間取り : "+FloorPlan);
		
		printHooder();
	}

}
