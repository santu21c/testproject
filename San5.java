package hasd;

import java.util.HashMap;
import java.util.Map;
class Per
{
	String name;
	int it;
	public  Per(String name,int it)
	{
		this.name = name;
		this.it = it;
	}
	public String toString()
	{
		return "{name:"+ name + " It " + it +"} " ;
		
	}
}

public class San5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Per p1 = new Per("sa",3);
		Per p2 = new Per("jkv",4);
		Per p3 = new Per("njjk",5);
  Map<Per,Integer> m1 = new HashMap<Per,Integer>();
  m1.put(p1,2);
  m1.put(p2,3);
  m1.put(p3,4);
  
  System.out.println("KeySet is: "+m1.keySet());
  for(Per p : m1.keySet())
  {
	  System.out.println(
			  p +"  " +m1.get(p));
  }
 // System.out.println(m1);
  
  
	}

}
