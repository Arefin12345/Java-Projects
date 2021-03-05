import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","Arefin");
        map.put("name1","tasin");
        map.put("name2","tanim");

        Set<String> keys = map.keySet();

  

        System.out.println(keys);
        for(String key: keys)
        {
            System.out.println(key+" "+map.get(key));
        }
    }

}
