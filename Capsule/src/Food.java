
public class Food extends Item{

	public void use(){
		System.out.println(getName()+"を食べた");
		setStock(getStock()-1);
		System.out.println("残りは"+getStock()+"個だ");
	}

}
