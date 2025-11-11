import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    Map<Integer, String> dialingCodes;

    public DialingCodes(){
        this.dialingCodes = new HashMap<>();
    }
    
    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {

        if(dialingCodes.containsKey(code)){
            return dialingCodes.get(code);
        }

        return "No values";
    }

    public void addNewDialingCode(Integer code, String country) {
        if(dialingCodes.containsKey(code)){
            return;
        } 
        if(dialingCodes.containsValue(country)){
            return;
        }
            
        setDialingCode(code,country);
        
    }

    public Integer findDialingCode(String country) {
          for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
        }
    }return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        
        Integer existingCode = findDialingCode(country);
        
        if(existingCode != null && !existingCode.equals(code)) {
        dialingCodes.remove(existingCode);
    }
        dialingCodes.put(code, country);
    
}
}


