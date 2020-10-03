import java.util.Map;
import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;

public class Test {
	public static void main(String[] args) throws Exception {

	    long startTime = java.lang.System.nanoTime();
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    FileReader reader = new FileReader("inputfile.txt");
	    BufferedReader br = new BufferedReader(reader);

	    String str = null;
	    while((str = br.readLine()) != null) {
		Integer count = map.get(str);
		map.put(str, count == null ? 1 : count + 1);
	    }

	    long endTime = java.lang.System.nanoTime();
	    System.out.println("cost : " + (double)(endTime - startTime)/1000000000 + "s");
	}
}
