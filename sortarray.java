package HWSW;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] array= {"Google","Microsoft","TestLeaf","Maverick"};
      int length=array.length;
      System.out.println(length);
      Arrays.sort(array);
      
      for (int i=length;i>0;i--)
      {
      System.out.println(Arrays.toString(array));
    	  break;
      }
      
      //Arrays.sort(array, Collections.reverseOrder());
	}

}
