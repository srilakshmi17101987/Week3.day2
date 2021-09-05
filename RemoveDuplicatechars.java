package HWSW;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.CharSet;

public class RemoveDuplicatechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name="PayPal India";
       System.out.println("The original string is"+ name);
       String str1=name.replaceAll(" ", "");
       System.out.println("The String after removing white spaces is: "+str1);
       char[] arr=str1.toCharArray();
      
       List<Character> charSet = new ArrayList<Character>();
       Set<Character> dupCharSet= new LinkedHashSet<Character>();
       
       
       for (int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
    	   
       }
    	   
       for (int i=0;i<arr.length;i++)
       {
    	   charSet.add(arr[i]);
    	    
       }
       
       System.out.println("********List********");
       
       System.out.println(charSet);
       
       for (Character character : charSet) {
    	   
    	   dupCharSet.add(character);
		
	}
       System.out.println("After removing duplicate characters is: " +dupCharSet);
	}
}
       
        
       
   
	
       
 
    		   
   
	


