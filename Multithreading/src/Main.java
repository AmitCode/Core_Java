import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("India", "Kolkata");
        cityCode.put("Russia", "Moscow");
        cityCode.put("USA", "New York");

        Iterator<String> iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();
                if ("India".equals(country)) {
                    iterator.remove();
                    //cityCode.put("Pakisthan", "Lahore");
                }
            //System.out.println("Country : " + country + ", Capitol : " + cityCode.get(country));
        }
        //use Iterator<Map.Entry<String,String>>
        Iterator<Map.Entry<String, String>> iterator2 = cityCode.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> entry = iterator2.next();
            if("India".equals(entry.getKey())) {
                iterator2.remove();
            }
            System.out.println("Country : " + entry.getKey() + ", Capitol : " + entry.getValue());
        }
    }
}