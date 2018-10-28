package maas.tutorials;

public class Book {
	private String title;
	private int quantity;
	private double price;
	private BookType type;
	
	public Book() {}
	
	public Book(String title, int quantity, double price, BookType type) {
		this.title = title;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public BookType getType() {
		return type;
	}
	
	public void setType(BookType type) {
		this.type = type;
	}
	
	public boolean isAvailableForSell() {
		return (getType() == BookType.SoftCopy || getQuantity() > 0);
	}
	
	public boolean Sell() {
		if (isAvailableForSell()) {
			setQuantity(getQuantity() - 1);
			return true;
		}
		
		return false;
	}
	
	public enum BookType{
		SoftCopy,
		HardCopy
	}
}
