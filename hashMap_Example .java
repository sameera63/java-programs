import java.util.HashMap;
public class hashMap_Example {
	public static void main(String args[]) {
		HashMap<String,String>map=new HashMap<>();
		map.put("india","newdelhi");
		map.put("srilanka","colombo");
		map.put("china","beijing");
		System.out.println(map.get("india"));
	}

}
