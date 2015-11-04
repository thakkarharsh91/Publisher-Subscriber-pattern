package itemset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

import model.Publisher;
import model.Subscriber;

/**
 * @author HARSH
 *
 */
public class EventsTracking {

	private ArrayList<ItemsInterface> eventsList = null;

	//@Begin : Added by Harsh Thakkar to add the constructor
	
	public EventsTracking() {
		// TODO Auto-generated constructor stub
		eventsList = new ArrayList<ItemsInterface>();
	}
	//@End : Added by Harsh Thakkar to add the constructor

	/**
	 * @param event
	 */
	public void createEvent(ItemsInterface event) {

		//@Begin : Added by Harsh Thakkar to add the events
		eventsList.add(event);
		//@End : Added by Harsh Thakkar to add the events

	}

	/**
	 * @param event
	 */
	public void deleteEvent(ItemsInterface event) {

		//@Begin : Added by Harsh Thakkar to delete the events
		for(int i=0;i<eventsList.size();i++)
		{
			if((event.getProductName().trim()).equalsIgnoreCase(eventsList.get(i).getProductName().trim()))
			{
				eventsList.remove(i);
			}
		}
		//@End : Added by Harsh Thakkar to delete the events

	}

	/**
	 * @param event
	 */
	public void updateEvent(LinkedHashMap<String, Publisher> map,String brandName) {
		
		//@Begin : Added by Harsh Thakkar to update the events based on the request
		Subscriber subsriber;
		
		
		/*for(int i = 0; i < eventsList.size(); i++)
		{
			if((event.getProductName().trim()).equalsIgnoreCase(eventsList.get(i).getProductName().trim()))       
			{
				subsriber = (Subscriber)eventsList.get(i);                           
				subsriber.createMessage(brandName,event.getVendorName());
			}
		}*/
		
		//@End : Added by Harsh Thakkar to update the events based on the request
	}

}
