
public class Capsule {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person("山田太郎",20);
		System.out.println(taro.getName());
		taro.setName("花子");
		System.out.println(taro.getName());

		String a = null;

		if("tanaka".equals(a)){
			System.out.println("nullぽよ");
		}else{
			System.out.println("nullのなかみ"+a);
		}

		a = "tanaka";

		if("tanaka".equals(a)){
			System.out.println("田中さん");
		}
	}


}
