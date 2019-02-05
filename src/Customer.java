
public class Customer {

	String name;
	int balance;
	Basket basket_of_products;

	public Customer(String name_of_customer, int initial_balance) {
		this.name = name_of_customer;
		this.balance = initial_balance;
		this.basket_of_products = new Basket();
	}

	public String getName ( ) {
		return name;
	}
	
	public int getBalance () {
		return balance;
	}
	
	public Basket getBasket() {
		return basket_of_products;
	}

	public int addFunds(int amount_to_be_added) {

		if (amount_to_be_added <0) 
			throw new IllegalArgumentException("Put a bigger amount");

		else {
			this.balance = balance + amount_to_be_added;
		}

		return balance;
	}

	public void addToBasket(MarketProduct product) {
		this.basket_of_products.add(product);
	}

	public boolean removeFromBasket(MarketProduct product) {
		return this.basket_of_products.remove(product);
	}

	public String checkOut () {
		
		System.out.println(this.basket_of_products);
		
		
		if (this.balance < this.basket_of_products.getTotalCost()) {
			throw new IllegalStateException("More money needed to checkout.");
		}
		
		else {
			//Basket myB =this.basket_of_products;
			//this.basket_of_products = null;
			//this.balance -= myB.getTotalCost();
			//basket_of_products.clear();
			//return myB.toString(); 
			
			this.balance = this.balance - basket_of_products.getTotalCost();
			String receipt = basket_of_products.toString();
			basket_of_products.clear();
			return receipt;
		}
		
		//return (this.basket_of_products.toString());
		

	}

}
