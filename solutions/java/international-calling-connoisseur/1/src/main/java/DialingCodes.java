import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    // Initialize the map to store the dialing codes and countries
    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        // Only add if neither the code (key) nor the country (value) exists
        if (!codes.containsKey(code) && !codes.containsValue(country)) {
            codes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        // Iterate through the entries to find the key matching the country value
        for (Map.Entry<Integer, String> entry : codes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        // Find if the country already exists to remove its old mapping
        Integer oldCode = findDialingCode(country);
        
        if (oldCode != null) {
            codes.remove(oldCode);
            codes.put(code, country);
        }
    }
}