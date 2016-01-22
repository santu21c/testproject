package hasd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class San3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
		HashMap<Integer,String> num = new HashMap<Integer,String>();
		LinkedHashMap<Integer,String> num1 = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> num2 = new TreeMap<Integer,String>();
	display(num);
	display(num1);
	display(num2);
		
	}
	public static void display(Map<Integer,String> map)
	{
		map.put(8,"san");
		map.put(1,"san1");
		map.put(2,"san2");
		for(Integer Val : map.keySet())
		{
			String val1 = map.get(Val);
			System.out.println("val1" +val1);
		}
	}
	

}
