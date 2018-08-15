package kadai;

public class Tea extends Drink implements Item{

	Tea(String name,int stock){
		super(name,stock);
	}

	public void use(){
		System.out.println(getName()+"を使用した");
		System.out.println("お茶の渋みで調子がよくなった");
	}



}
