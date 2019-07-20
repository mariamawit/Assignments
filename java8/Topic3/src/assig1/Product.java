package assig1;

public class Product {

	String id;
	Float cost;
	int noOfItems;
	
	
	public Product() {
		super();
	}


	public Product(String id, Float cost, int noOfItems) {
		super();
		this.id = id;
		this.cost = cost;
		this.noOfItems = noOfItems;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Float getCost() {
		return cost;
	}


	public void setCost(Float cost) {
		this.cost = cost;
	}


	public int getNoOfItems() {
		return noOfItems;
	}


	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	
	
	
	
	
}
