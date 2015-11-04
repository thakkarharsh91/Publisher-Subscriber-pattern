package dataflow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

import model.Publisher;

/**
 * @author HARSH
 *
 */
public class CopyOfMain {

	//@Begin : Added by Harsh Thakkar to start the program execution
	public static void main (String[] args){
		//callHashMap();
		//callTreeMap();
		//callLinkedHashMap();
		callLinkedHashMapPublisher();
	}
	//@End : Added by Harsh Thakkar to start the program execution

	private static void callLinkedHashMapPublisher() {
		BufferedReader buffer = null;
		String line = "";
		LinkedHashMap<String, Publisher> publisherMap = new LinkedHashMap<String,Publisher>();
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
							System.out.println(publisher.getVendorName());
						}
						else
						{
							Publisher publisher =  new Publisher(csvData[1],csvData[2],csvData[3]);
							publisherMap.put(csvData[2], publisher);
						}
					}
					else if(csvData[0].trim().equalsIgnoreCase("unsubscribe"))
					{
						
					}
					else
					{
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

	private static void callLinkedHashMap() {
		BufferedReader buffer = null;
		String line = "";
		LinkedHashMap<String, LinkedHashSet<String>> publisherMap = new LinkedHashMap<String,LinkedHashSet<String>>();
		LinkedHashSet<String> publisherSet = null;
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
						if(publisherMap.containsKey(csvData[1]))
						{
							publisherSet = publisherMap.get(csvData[1]);
							publisherSet.add(csvData[2]);
						}
						else
						{
							publisherSet =  new LinkedHashSet<String>();
							publisherSet.add(csvData[2]);
							publisherMap.put(csvData[1], publisherSet);
						}
					}
				}
			}
			
			Set<String> tempSet = publisherMap.keySet();
			for(String s : tempSet)
			{
				System.out.println(s + " linkedhashmap " + publisherMap.get(s));
			}
			System.out.println("\n");
			
		}
		catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		
	}

}
