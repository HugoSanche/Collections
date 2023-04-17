import java.util.HashMap;
import java.util.Map;
public class Location {
    private final int idLocation;
    private final String description;
    private final Map<String, Integer> exits;
    public Location(int idLocation, String description,Map<String,Integer> exits) {
        this.idLocation = idLocation;
        this.description = description;
        this.exits= new HashMap<String,Integer>(exits);
        this.exits.put("Q",0);
    }
//    public void addExist(String description, int idLocation){
//        exits.put(description,idLocation);
//    }

    public String getDescription() {
        return description;
    }
    public Map<String, Integer> getExists() {
        return new HashMap<String, Integer>(exits);
    }
}