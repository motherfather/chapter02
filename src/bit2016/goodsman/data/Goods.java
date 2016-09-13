package bit2016.goodsman.data;

public class Goods {
	public Goods() {
		System.out.println("생성자 호출");
		count++;
	}

	public static int count; // class변수

	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 정보보호!
		// 필드값은 private하고 메소드를 public으로 해서 메소드를 통해서 조작하도록 한다!!
		if (price < 0) {
			price = 0;
		}
		this.price = price; // 객체(인스턴스) 자신을 가리킬때 this!!
	} 									 // 파라미터 price와 구분하기 위해서!!

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
}