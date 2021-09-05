package HWSW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secodlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> list1=new ArrayList<Integer> (Arrays.asList(3,7,6,4,8,10,9));
       List<Integer> list2=new ArrayList<Integer> ();
       //list1.set(5, 12);
       for ( Integer integer : list1) {
		System.out.println(integer);
	}
    	Collections.sort(list1);
    	System.out.println(list1);
    	int size=list1.size();
    	int secondlarget=(size-1);
    	System.out.println(secondlarget);
    	System.out.println("The second largest no is: "+list1.get(5));
    	
    	
		
	}

}
