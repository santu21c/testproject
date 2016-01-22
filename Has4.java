package hasd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Has4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,String> num = new HashMap<Integer,String>();
	LinkedHashMap<Integer,String> num2 = new LinkedHashMap<Integer,String>();
	TreeMap<Integer,String> num3 = new TreeMap<Integer,String>();
	test(num);
	test(num2);
	test(num3);
	}
	static void test(Map<Integer,String> map)
	{
		map.put(8,"san");
		map.put(7,"san1");
		map.put(6,"san2");
		map.put(5,"san3");
		for(Integer val:map.keySet())
		{
			String value = map.get(val);
			System.out.println("the value is" +value);
		}
	}

}
