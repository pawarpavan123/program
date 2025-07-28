	package Hash_Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map a = new HashMap();
      a.put(101, "abc");
      a.put(102, "omkar");
      a.put(103, "pavan");
      a.put(104, "rishi");
      a.put(105, "abhiman");                

      //System.out.println(a);
      Set s=a.entrySet();
      Iterator i = s.iterator();
      while (i.hasNext()) {
	  System.out.println(i.next());
 }
	}

}
