package Exercise1_6;

public class TheBook {
	String title;
	double price;
	int yearOfPublication;
	Author author;

	TheBook(String title, double price, int yearOfPublication, Author author) {
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.author = author;
	}
}
