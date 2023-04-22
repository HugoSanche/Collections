public class Planet extends HeavenlyBodyChallenge{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBodyChallenge moon) {
        if (moon.getKey().getBodyType()==BodyType.MOON){
            return super.addSatellite(moon);
        }else{
            return false;
        }
    }
}
