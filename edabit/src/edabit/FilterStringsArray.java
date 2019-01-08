package edabit;

import java.util.ArrayList;
import java.util.List;

public class FilterStringsArray {

//	static final String[] strings = { "a", "aa", "aa123", "123456", "" };
	static final String[] strings = { "1", "a", "b", "0", " 15" };

	public static void main(String args[]) {
		String[] out = filterArray(strings);

		for (String s : out) {
			System.out.println(s);
		}

	}

	// You should really mention the thing about how you can have no duplicates and
	// the order must be maintained. Unless that really was not your intension, in
	// which case I think the test cases are buggy.

	public static String[] filterArray(String[] str) {
		List<String> retVal = new ArrayList<String>();

		for (String s : str) {
			String temp = s.trim().replaceAll("[^0-9]", "");
			if (temp.length() > 0 && !retVal.contains(temp)) {
				retVal.add(temp);
			}
		}
		return (String[]) retVal.toArray(new String[retVal.size()]);
	}

}
