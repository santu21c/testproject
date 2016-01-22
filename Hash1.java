package hasd;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> num = new HashMap<Integer,String>();
 int i;
		num.put(1,"sa");
		num.put(3,"sga");
		num.put(8,"sah");
		num.put(5,"sai");
		num.put(0,"saj");
		num.put(0,"cjks");
		String text = num.get(0);
		for(Map.Entry<Integer,String> entry: num.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
		System.out.println(text);
	}

}
