
public class Basket {

	int size;
	private MarketProduct[] array_of_products;

	public Basket() {
		this.size = 0;
		this.array_of_products = new MarketProduct[size];
	}
	
	public MarketProduct[] getProducts() {

		MarketProduct[] copy_of_array = this.array_of_products.clone();
		return copy_of_array;
	}

	public void add (MarketProduct product) {
			
		if (this.array_of_products.length == 0) {
			 this.size++;
			 MarketProduct[] newArray = new MarketProduct[size];
			 newArray[0] = product;
			 this.array_of_products = newArray;
		 }
		 
		 else if (this.array_of_products.length == this.size) {
			 MarketProduct [] newArray = new MarketProduct [size*8];
			 for (int i = 0 ; i < array_of_products.length ; i++) {
				 newArray[i] = this.array_of_products[i];
			 }
			 newArray[this.size] = product;
			 this.array_of_products = newArray;
			 this.size++;
			 
		 }
		 
		 else {
			 this.array_of_products[size] = product;
			 size++;
		 }
		
		
	} 
		
	/*public void add (MarketProduct product) {
		MarketProduct[] arrayAdd = new MarketProduct [array_of_products.length+1];
		for (int i = 0 ; i < array_of_products.length ; i ++) {
			arrayAdd [i] = array_of_products [i];
		}
		arrayAdd[array_of_products.length] = product;
		array_of_products = arrayAdd;
	} */
	
	public boolean remove (MarketProduct product) {
		
		for (int i=0 ; i < this.array_of_products.length ; i++) {
			if (product.equals(this.array_of_products[i])) {
				for (int j = i ; j< (this.array_of_products.length-1) ; j++) {
					this.array_of_products[j] = this.array_of_products[j+1];
					this.array_of_products[j+1] = null;
				}
				size--;
				return true;
			}
		}
		
		//if (array_of_products == null) 
			//return false;
	return false;
		
	}
	
	public void clear () {
		for (int i = 0; i < this.array_of_products.length ; i++)
			array_of_products[i] = null;
	}
	
	public int getNumOfProducts () {
		
		int number_of_products = 0;
		for (int i =0 ; i < array_of_products.length ; i++) {
			number_of_products ++;
		}
		return number_of_products;
	}
	
	public int getSubTotal () {
		int sum = 0;
		for (int i = 0; i < size ; i++) {
			
			int added_amount = array_of_products[i].getCost();
			sum = sum + added_amount;	
		}	
		
		return sum;	
	}
	
	public int getTotalTax() {
		int tax = 0;
		for (int i = 0; i < size ; i++) {
			
			if (array_of_products[i] instanceof Jam) 
				tax = tax + array_of_products[i].getCost() * 15/100;
		
		}
		return tax;
	}
	
	
	public int getTotalCost() {
		return getSubTotal() + getTotalTax();
		
	}
	
	public String toString (int a) {
		if (a <= 0)
			return "-";
		else {
			double price =(a/100.00);
			return String.format("%.2f", price);
		}
	}
	
	
	
	public String toString() {
		
		String receipt = "\n";
		
		for (int i = 0; i < size ; i++) {
			
		receipt = receipt+ this.array_of_products[i].getName() + "\t"+ toString(this.array_of_products[i].getCost()) +"\n";
		}
		
		receipt = receipt + "\nSubtotal " + toString(getSubTotal()) + "\nTotal Tax: " + toString(getTotalTax()) + "\n\nTotalCost: " + toString(getTotalCost());
		//System.out.println("Hello");
		//System.out.println(receipt1);
		return receipt;
	}
}

