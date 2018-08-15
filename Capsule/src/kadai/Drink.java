package kadai;

public class Drink {

	private String name;
	private int stock;

	Drink(String name,int stock){
		this.name = name;
		this.stock = stock;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getStock(){
		return stock;
	}
}
