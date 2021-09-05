package HWSW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;

public class DuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 List<Integer> intlist=new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		 Collections.sort(intlist);
	     Set<Integer> setlist=new LinkedHashSet<Integer> ();
	     
	     
	     for  (Integer integer : intlist) {
	    	 
			setlist.add(integer);
		}
		
		
		System.out.println("The new set list is"+ setlist);
		
		//System.out.println("The size of the set is: "+);
		
	}

}
