package HWSW;

import java.util.ArrayList;
import java.util.Collections;

import com.sun.tools.javac.util.List;

public class sortusingcollections {

	public static void main(String[] args) {
//TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Wipro");
		list.add("HCL"); 
		list.add("CTS");
		list.add("Aspire Systems");
		list.add("TCS");
		System.out.println(list);
		Collections.sort(list);
         for(String string1 : list) {
			System.out.println(string1);
		}		
	}
	

}
