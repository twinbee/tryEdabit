package edabit;

import java.util.HashMap;
import java.util.Map;

public class ValuesArray {

	static private Map<String,String> dict = new HashMap <String, String> ();
	
	public static void main( String args[]) {
       getValues(dict);
	}

    public static String[] getValues(Map<String,String> dict) {
        String [] values = (String[]) dict.values().toArray(new String [dict.size()]);
        return values;
      }
	
}
