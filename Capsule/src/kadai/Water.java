package kadai;

public class Water extends Drink implements Item{

	Water(String name,int stock){
		super(name,stock);
	}

	public void use(){
		System.out.println(getName()+"を使用した");
		System.out.println("のどが潤った。");
	}

}
