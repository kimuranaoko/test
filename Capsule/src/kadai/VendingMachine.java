package kadai;

import java.util.ArrayList;

public class VendingMachine {
	ArrayList <Drink> drinks = new ArrayList<Drink>();

	public void stocking(Drink d){
		drinks.add(d);
	}

	public void buy(int i){
		if(drinks.get(i).getStock()==0){
			System.out.println("その商品は売切れです。");
		}else{
			System.out.println(i+"の商品が選択されました。");
			String n =drinks.get(i).getName();
			System.out.println(n+"を購入します。");
		}
	}
}
