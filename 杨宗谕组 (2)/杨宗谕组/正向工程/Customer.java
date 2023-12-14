package 网上书店.类图;


/**
 * @author 肖
 * @version 1.0
 * @created 18-10月-2023 20:52:56
 */
public class Customer {

	private String name;
	private String email;
	private ShoppingCart shoppingCart;

	public Customer(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param book
	 */
	public String viewBookDetails(Book book){
		return "";
	}

	/**
	 * 
	 * @param book
	 */
	public removeFrom(Book book){

	}

	/**
	 * 
	 * @param book
	 */
	public addToCart(Book book){

	}

	/**
	 * 
	 * @param book
	 * @param quantity
	 */
	public modifyOrder(Book book, Integer quantity){

	}

	public confirmOrder(){

	}

	public submitOrder(){

	}
}//end Customer