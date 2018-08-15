
public class BookMaker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

			Book book1=new Book("A","B");
			Book book2=new Book("C","d");
			Book book3=new Book("E","f");

			Book[] books={book1,book2,book3};

			for(int i=0;i<3;i++){
				System.out.println("本のタイトル"+books[i].getTitle());
				System.out.println("本のジャンル"+books[i].getGenre());
		}

	}

}
