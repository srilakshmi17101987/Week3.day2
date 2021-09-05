package HWSW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer> (Arrays.asList(7,3,5,6,8,16));
		Collections.sort(list1);
		int diff= list1.get(0)-0;
		//System.out.println(list1.get(0)-0);
		
		
		//System.out.println(list1.get(0));
		
		for (int i=0;i<list1.size();i++)
		{
			if ((list1.get(i)-i)!= diff)
			{
				while (diff< list1.get(i)-i)
				{
					int mi=i+diff;
					list1.add(mi);
							diff++;
				}
			}
			
		}
		Collections.sort(list1);
		System.out.println(list1);

	}

}
