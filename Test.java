import java.util.Map;
import java.util.HashMap;
import java.util.FileReader;
import java.util.BufferedReader;

public class Test {
	public static void main(String[] args) throws Exception {

	    long startTime = System.currentTimeMillis();
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    FileReader reader = new FileReader("inputfile.txt");
	    BufferedReader br = new BufferedReader(reader);

	    String str = null;
	    while((str = br.readLine()) != null) {
		Integer count = map.get(str);
		map.put(str, count == null ? 1 : count + 1);
	    }

	    long endTime = System.currentTimeMillis();
	    System.out.println("cost : " + (endTime - startTime)/1000 + "s");
	}
}
