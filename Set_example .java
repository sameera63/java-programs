import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.LinkedHashMap;
public class Set_example {
public static void main(String[] args) {
	Set<Integer>hs=new HashSet<>();
	hs.add(52);
	hs.add(96);
	hs.add(1);
	hs.add(3);
	System.out.println(hs);
	Set<Integer>li=new LinkedHashSet<>();
	li.add(33);
	li.addAll(hs);
	System.out.println(li);
	TreeSet<Integer>ts=new TreeSet<>();
	ts.addAll(li);
	System.out.println(ts);
	Map<Integer,String>hm=new HashMap<>();
	hm.put(01,"sai");
	hm.put(02,"sam");
	System.out.println(hm);
	TreeMap<Integer,String>tm=new TreeMap<>();
	tm.put(02,"sam");
	tm.put(01,"sai");
	tm.put(03,"asif");
	System.out.println(tm);
	LinkedHashMap<Integer,String>lh=new LinkedHashMap<>();
	lh.put(01,"sammi");
	lh.put(02,"rizzu");
	System.out.println(lh);
}
}
