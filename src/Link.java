
public class Link {
	private String bookName;
	private int booksSold;
	private Link next;
	
	Link (String bookName, int booksSold)
	{
		this.bookName = bookName;
		this.booksSold = booksSold;
		
	}
	
	public void display() {
		System.out.printf("%s: %d sold", bookName, booksSold);
	}
	
	public String toString() {
		return bookName;
	}
	
}
