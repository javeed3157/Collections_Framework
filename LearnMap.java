import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap{
    public static void main(String[] args) {
        Map<String,Integer> numbers=new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        if(!numbers.containsKey("two")){//First method to stop overriding
            numbers.put("two", 4);
        }
        System.out.println(numbers.containsValue(2));
        System.out.println(numbers.isEmpty());
        numbers.putIfAbsent("two", 4);//Second method to stop overriding
        numbers.put("four", 4);
        numbers.put("five", 5);
        System.out.println(numbers);
        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key:numbers.keySet()){
            System.out.println(key);
        }
        for(Integer val:numbers.values()){
            System.out.println(val);
        }

        Map<String,Integer> number=new TreeMap<>();
        //Based on keys it is sorted
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);
        number.put("five", 5);
        System.out.println(number);
        number.remove("three");
        System.out.println(number);
    }
}