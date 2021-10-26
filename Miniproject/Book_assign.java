class Book 
{
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	public Book() 
	{
		
	}
	public Book(String bookName, int bookPrice, double bookDiscountRate) 
	{
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	void setBookPrice(int bookPrice) 
	{
		this.bookPrice = bookPrice;
	}
	
	int getBookPrice() 
	{
		return this.bookPrice;
	}
	
	double getDiscountBookPrice() 
	{
		return this.bookPrice-(this.bookPrice * (this.bookDiscountRate/100.0));
	}
}



public class Book_assign {

	public static void main(String[] args) {
		
		Book bookArray [] = new Book[3];
		Book book1 = new Book("SQL Plus", 50000, 5);
		Book book2 = new Book("Java 2.0", 40000, 3);
		Book book3 = new Book("JSP Servlet", 60000, 6);
		
		bookArray[0] = book1;
		bookArray[1] = book2;
		bookArray[2] = book3;
		
		for (Book a : bookArray) 
		{
			System.out.println(a.bookName + " " + a.bookPrice + "원 " + a.bookDiscountRate + "%");
		}
		
		System.out.println("");
		
		System.out.println("책 가격의 합 : " + (book1.bookPrice + book2.bookPrice + book3.bookPrice) + "원");
		System.out.println("할인 된 책 가격의 합 : " + (book1.getDiscountBookPrice() + book2.getDiscountBookPrice() + book3.getDiscountBookPrice()) + "원");
		


	}

}
