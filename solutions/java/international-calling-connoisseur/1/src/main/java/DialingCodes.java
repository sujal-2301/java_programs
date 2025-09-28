import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    Map<Integer, String> map = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return map;
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code, country);
    }

    public String getCountry(Integer code) {
        return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!map.containsKey(code) && !map.containsValue(country)){
        map.put(code, country);    
        }
    }

    public Integer findDialingCode(String country) {
        for(int key : map.keySet()){
            if(map.get(key) == country){
                return key;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(findDialingCode(country) != null){
            map.remove(findDialingCode(country));
            map.put(code, country);
        }
    }
}
