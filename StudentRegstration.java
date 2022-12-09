
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StudentRegstration {

    static Map<String, List<String>> map1 = new HashMap<String, List<String>>();
    static Map<String, Integer> map2 = new HashMap<String, Integer>();

    public void add_in_map1(String key, List<String> values) {
        map1.put(key, values);
        System.out.println(map1);
    }
}
