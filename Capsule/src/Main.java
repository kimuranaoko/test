
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Item i1 = new Food();
		Item i2 = new Food();
		Item i3 = new Drink();

		i1.setName("卵");
		i1.setStock(10);
		i2.setName("パン");
		i2.setStock(3);
		i3.setName("コーヒー");
		i3.setStock(30);

		i1.use();
		i2.use();
		i3.use();
	}

}
