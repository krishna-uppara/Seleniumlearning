import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CharacterArray {

	public static void main(String[] args) {
		char []a= {'a','s','d','f','g','h','g'};
		
	      String aabc =new String(a);
	      //char abc[] =aabc.toCharArray();
	      Map<Character,Integer> xyz = new HashMap<Character,Integer>();
	      for(char c :a)
	      { 
	    	  if(Character.isAlphabetic(c))
	    	  {
	    		  if(xyz.containsKey(c))
	    			  {
	    			  xyz.put(c, +1);
	    			  }
	    		  else
	    		  {
	    			  xyz.put(c, 1);
	    			  
	    		  }
	    	  }
	      }
	        // System.out.println(Character.toLowerCase('c'));
	      //System.out.println(Character.toLowerCase('C'));
	      System.out.println(aabc);

	}

}
