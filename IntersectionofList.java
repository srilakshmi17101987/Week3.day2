package HWSW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> intlist=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7,9,10,16));
		 List<Integer> intlist1=new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7,12,16,18,19,22));
		 int len=intlist.size();
		 int len1=intlist1.size();
		 if(len>len1) 
		 {
		 System.out.println("Intersection of elements "+ intlist.retainAll(intlist1));
		 System.out.println(intlist);
		 }
		 else if(len1>len)
		 {
			 System.out.println("Intersection of elements "+ intlist1.retainAll(intlist));
			 System.out.println(intlist1);
			 
		 }
		 else
		 {
			 System.out.println("Intersection of elements "+ intlist.retainAll(intlist1));
		 System.out.println(intlist);
		 }
		// System.out.println("Unique elements "+intlist1.removeAll(intlist));
         //System.out.println(intlist1);
         
	}

}
