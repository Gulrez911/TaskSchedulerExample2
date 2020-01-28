import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Akshay");
		map.put(2, "Gulrez");
		map.put(3, "Talish");
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

		Set<Integer> key = map.keySet();

		for (Integer kk : key) {

//			if (kk == 2) {
				key.remove(kk);
//			}
			System.out.println(kk);
		}
	}
}
