package hasd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Per1 implements Comparable<Per1>
{
	String name;
	Per1(String name)
	{
		this.name = name;
	}
	public String toSting()
	{
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Per1 other = (Per1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Per1 num3) {
		// TODO Auto-generated method stub
		
		return name.compareTo(num3.name);
	}
}

public class San6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Per1> num1 = new ArrayList<Per1>();
		Set<Per1> num2  = new TreeSet<Per1>();
		addElements(num1);
		addElements(num2);
		System.out.println("now iam sorting list");
//		Collections.sort(num1);
		showElements(num1);
		System.out.println("next tree Set");
		showElements(num2);
		
		
		}

	private static void showElements(Collection<Per1> col) {
		// TODO Auto-generated method stub
		for(Per1 p : col)
		{
		System.out.println(p);	
		}
	}

	private static void addElements(Collection<Per1> col) {
		// TODO Auto-generated method stub
		col.add(new Per1("san"));
		col.add(new Per1("sajnjk"));
		col.add(new Per1("san2"));
		col.add(new Per1("san3"));
	}
	

}
