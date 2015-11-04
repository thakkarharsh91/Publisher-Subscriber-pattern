 package model;

import itemset.EventsTracking;
import itemset.ItemsInterface;

/**
 * @author HARSH
 *
 */
public class Publisher{

	private String vendorName = ""; //Initialized the variable

	private String productName = ""; //Initialized the variable
	
	private String brandName = ""; //Initialized the variable
	
	//@Begin : Added by Harsh Thakkar to include the parameter in the implement methods and the constructor
	
	public Publisher(String vendor,String product,String brand) {
		this.vendorName = vendor;
		this.productName = product;
		this.brandName = brand;
	}

	public String getProductName() {
		return this.productName; //Return the value of string productName
	}

	
	public String getVendorName() {
		// TODO Auto-generated method stub
		return this.vendorName; //Return the value of string vendorName
	}
	//@End : Added by Harsh Thakkar to include the implement methods and the constructor

	/*public void publishProduct() {
		// TODO Auto-generated method stub
		EventsTracking event = event.updateEvent(map, brandName);
	}*/
}
