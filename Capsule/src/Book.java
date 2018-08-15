
public class Book {

	private String title;
	private String genre;

	Book(String title,String genre){
		this.title = title;
		this.genre = genre;
	}

	Book(String title){
		this.title = title;
		this.genre="その他";
	}

	public String getTitle(){
		return title;
	}

	public String getGenre(){
		return genre;
	}

}
