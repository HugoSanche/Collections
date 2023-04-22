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
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyChallenge> satellites;


    public HeavenlyBodyChallenge(String name, double orbitalPeriod,BodyType bodyType) {
        this.key=new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();

    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBodyChallenge> getSatellites() {
        return new HashSet<>(this.satellites);
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

                return this.key.equals(myObj.getKey());

        }
        return  false;
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyType bodyType){
        return  new Key(name,bodyType);
    }
    @Override
    public String toString() {
        return this.key.getName()+": "+this.key.getBodyType()+", "+this.orbitalPeriod+" ";
    }
    public static final class Key{
        private String name;
        private BodyType bodyType;

        public Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode()+57+this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key=((Key) obj);
            if (this.name.equals(key.getName())){
                return this.bodyType.equals(key.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name+" "+this.bodyType;
        }
    }
}
