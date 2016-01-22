package hasd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		HashMap<Integer,String> num = new HashMap<Integer,String>();
		LinkedHashMap<Integer,String> num1 = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> num2 = new TreeMap<Integer,String>();
		testMap(num);
	}
		public static void testMap(Map<Integer,String> map)
		{
			map.put(9,"sa");
			map.put(5,"san");	
			map.put(7,"sant");
			map.put(8,"santu");
			for(Integer Key : map.keySet())
			{ 
				String value = map.get(Key);
				System.out.println("value =" +value);
			}
		}
	}


