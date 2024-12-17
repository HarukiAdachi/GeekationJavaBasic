package objectExercise;

public class Property {

	private String name;
	private String have;
	private String kind;
	private int price;

	public Property(String name, String have, String kind, int price) {
		this.name = name;
		this.have = have;
		this.kind = kind;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHave() {
		return have;
	}

	public void setHave(String have) {
		this.have = have;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void printHeader() {
		System.out.println("=============================");
	}
	
	public void printHooder() {
		System.out.println("=============================");
	}

	public void printData() {
		System.out.println("物件名 : " + name);
		System.out.println("物件所有者名 : " + have);
		System.out.println("物件種別 : " + kind);
		System.out.println("物件価格 : " + price+"円");
	}

}
