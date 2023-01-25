package bookStores;

public class Book {
	// -------------------------------------------------------
		// Assignment1
		// part1
	    // Written by: (Diyi Lin student id40086388)
		// For COMP 249 Section  � winter 2019
		// --------------------------------------------------------

	//attributes
	private String title;
	private String author;
	private long ISBN;
	private double price;
	public static int num=0;
	//constructor
	public Book(String title,String author,long ISBN,double price){
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	     num++;
	}

	//copy constructor
	Book(Book a){
		title = a.title;
		author = a.author;
		ISBN = a.ISBN;
		price = a.price;
		 num++;
	}

	//accessors
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public long getISBN() {
		return ISBN;
	}
	public double getPrice() {
		return price;
	}

	//mutators
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	//static method
	public static int findNumberOfCreatedBooks() {
		return num;
	}

	//compared 
	public boolean equals(Book a) {
		return (this.ISBN == a.ISBN && this.price == a.price);
	}

	//display 
	public String toString() {
		return(title+" is written by "+author+"  ISBN: "+ISBN+"  price: CA$"+price);
	}

	//test code
	public static void main(String[] args) {
	    Book b1 = new Book("Red","Jacky Bruce",2222,100);
	    Book b2 = new Book(b1);
	    
	    System.out.println(b2.toString());
	    
	    System.out.println(b1.getTitle());
	    System.out.println(b1.getAuthor());
	    System.out.println(b1.getISBN());
	    System.out.println(b1.getPrice());
	    
	    b2.setTitle("Blue");
	    b2.setAuthor("Bucky Jane");
	    b2.setISBN(2223);
	    b2.setPrice(101);
	    System.out.println(findNumberOfCreatedBooks());
	    System.out.println(b2.toString());
	}

	

}
