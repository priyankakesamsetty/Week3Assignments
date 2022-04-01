package Week3Day1ClassRoom;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<String> listobj = new ArrayList<String>();
		listobj.add("Adam");
		listobj.add("Ben");
		listobj.add("Zara");
		listobj.add("Adam");
		listobj.add("Charlie");
		listobj.add("James");
		listobj.add("Ben");
		listobj.add("Adam");
		listobj.add("George");
		listobj.add("Adam");
		System.out.println(listobj);
		
		for(int i =0; i < listobj.size(); i++){
	         //if (listobj.get(i)==listobj.get(i+1))
			for(int j=i+1;j<listobj.size();j++)
				if(listobj.get(i)== listobj.get(j)){
	             System.out.println(listobj.get(i)+" is duplicated");
	        		 }
		}
	        	 System.out.println("No duplicates");
	        	 
	     int count=0;
	     for(String eachElement:listobj)
	    	 if(eachElement=="Adam")
	    count++;
	     System.out.println("Adam Occurs"+count+"times in the list");
}
}

