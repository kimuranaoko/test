
public class Drink extends Item{
	public void use(){
		System.out.println(getName()+"を飲んだ");
		setStock(getStock()-1);
		System.out.println("残りは"+getStock()+"はいだ");

	}

}
