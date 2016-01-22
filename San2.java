package hasd;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.TabSet;

public class San2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3= new TreeSet<String>();
		set2.add("san1");
		set1.add("san2");
		set2.add("san3");
		set1.add("san4");
		set1.add("sanf");
		set1.add("san5");
System.out.println(set1);
display(set1);
display(set2);
	}
  static	void display(Set<String> set)
	{
		for(String val : set)
		{
			System.out.println("value is" +val);
		}
	}

}
