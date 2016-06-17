package hasd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
//hello how r u?? i'm checking git repository
public class San4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> num1 = new HashSet<String>();
    Set<String> num2 = new LinkedHashSet<String>();
    Map<String,Integer> map = new HashMap<String,Integer>();
    num1.add("santosh");
    num1.add("fjk");
    num1.add("gnkdj");
    System.out.println(num1);
    map.put("santosh",3);
    map.put("mukesh",4);
    map.put("jkndsjk",5);
    System.out.println(map);
    System.out.println("creating set2");
    num2.add("cat");
    num2.add("dog");
    num2.add("santosh");
    Set<String> num3 = new HashSet<String>();
    Set<String> intersection = new HashSet<String>(num1);
    intersection.retainAll(num2);
    System.out.println(intersection);
	}

}
