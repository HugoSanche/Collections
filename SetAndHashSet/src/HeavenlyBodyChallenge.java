import java.util.HashSet;
import java.util.Set;
enum BodyType{
    PLANET,
    DWARF_PLANET,
    MOON,
    STAR,
    COMET,
    ASTEROID
}
public  class HeavenlyBodyChallenge {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyChallenge> satellites;
    private final BodyType bodyType;

    public HeavenlyBodyChallenge(String name, double orbitalPeriod,BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType=bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBodyChallenge> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public  boolean addSatellite(HeavenlyBodyChallenge moon){
        return this.satellites.add(moon);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj instanceof HeavenlyBodyChallenge myObj){
            //HeavenlyBodyChallenge myObj=((HeavenlyBodyChallenge) obj);//only above java 16
            if (this.getName().equals(myObj.getName())){
                return this.getBodyType().equals(myObj.getBodyType());
            }
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+57+this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name+" "+this.orbitalPeriod+" "+this.bodyType;
    }
}
