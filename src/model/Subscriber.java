package model;

import itemset.ItemsInterface;

/**
 * @author HARSH
 *
 */

public class Subscriber implements ItemsInterface {

	private String consumerName = ""; //

	private String productName = "";

	private String notificationMessage = "";

	//@Begin : Added by Harsh Thakkar to include the parameter in the implement methods, constructor and method to create the notification message
	
	public Subscriber(String consumer,String product) {
		// TODO Auto-generated constructor stub
		this.consumerName = consumer;
		this.productName = product;
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return this.productName; //return the value of string productName
	}

	@Override
	public String getConsumerName() {
		// TODO Auto-generated method stub
		return this.consumerName; //return the value of string consumerName
	}

	@Override
	public String getVendorName() {
		// TODO Auto-generated method stub
		return null;  //return nothing
	}
	
	/**
	 * @param brandName
	 * @param vendorName
	 */
	public void createMessage(String brandName, String vendorName) {
		notificationMessage = this.getConsumerName() + " notified of " + brandName + " from " + vendorName;
		System.out.println(notificationMessage);
	}
	//@End : Added by Harsh Thakkar to include the implement methods, constructor and method to create the notification message
}
