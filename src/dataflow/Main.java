package dataflow;

import itemset.EventsTracking;
import itemset.ItemsInterface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

import model.Publisher;
import model.Subscriber;

/**
 * @author HARSH
 *
 */
public class Main {

	//@Begin : Added by Harsh Thakkar to start the program execution
	public static void main (String[] args){
		ItemsInterface event = null;
		EventsTracking trackEvents = null;
		BufferedReader buffer = null;
		String line = "";
		LinkedHashMap<String, Publisher> publisherMap = new LinkedHashMap<String,Publisher>();
		LinkedHashMap<String, ArrayList<Subscriber>> subscriberMap = new LinkedHashMap<String,ArrayList<Subscriber>>();
		ArrayList<Subscriber> subscriberList;

		try{
			buffer = new BufferedReader(new FileReader(new File("H:\\Study Material\\ASU\\Study Material ASU\\Sem 1\\SAD\\Homework\\Programming Assignment\\Book1 - Copy.csv")));
			while ((line = buffer.readLine()) != null) {
				StringTokenizer stringTokens = new StringTokenizer(line,"");
				while(stringTokens.hasMoreTokens())
				{
					String[] csvData = stringTokens.nextToken().split(",");
					if(csvData[0].trim().equalsIgnoreCase("publish"))
					{
						/*event = new Publisher(csvData[1], csvData[2]);                
						trackEvents.updateEvent(event, csvData[3]);   */
						if(publisherMap.containsKey(csvData[2]))
						{
							Publisher publisher = publisherMap.get(csvData[2]);
							//publisher.publishProduct();
							//trackEvents.updateEvent(publisherMap, csvData[3]);
						}
						else
						{
							Publisher publisher =  new Publisher(csvData[1],csvData[2],csvData[3]);
							publisherMap.put(csvData[2], publisher);
						}
					}
					else if(csvData[0].equalsIgnoreCase("unsubscribe"))
					{       
						event = new Subscriber(csvData[1], csvData[2]);
						trackEvents.deleteEvent(event);
					}
					else
					{
						if(subscriberMap.containsKey(csvData[2]))
						{
							subscriberList = subscriberMap.get(csvData[2]);
						}

					}
				}
			}
		}
		catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
	}
	//@End : Added by Harsh Thakkar to start the program execution
}
