import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {
    private static Map<String,HeavenlyBodyChallenge> solarSystem=new HashMap<>();
    private static Set<HeavenlyBodyChallenge> planets=new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBodyChallenge temp=new Planet("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new Planet("Venus",225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp=new Planet("Earth",365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBodyChallenge tempMoon=new Moon("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);

        temp=new Planet("Mars",687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon=new Moon("Deimos",1.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Mars

        temp=new Planet("Jupiter",4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon=new Moon("Io",1.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        tempMoon=new Moon("Europa",3.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        tempMoon=new Moon("Ganymede",7.1);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        tempMoon=new Moon("Callisto",16.7);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        temp=new Planet("Saturn",10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp=new Planet("Uranus",30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp=new Planet("Neptune",165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp=new Planet("Pluto",248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBodyChallenge planet : planets){
            System.out.println("\t"+planet.getName());


            for (HeavenlyBodyChallenge lunas :planet.getSatellites()){
                System.out.println("\t \t Moons "+lunas.getName());
            }
        }
        Set<HeavenlyBodyChallenge> moons=new HashSet<>();
        for (HeavenlyBodyChallenge lunas :planets){
            moons.addAll(lunas.getSatellites());
        }
        System.out.println("\nList of Moons:");
        for (HeavenlyBodyChallenge moon :moons ){
            System.out.println("\t"+moon.getName());
        }

        HeavenlyBodyChallenge pluto =new DwarfPlanet("Pluto",842);
        planets.add(pluto);

        for(HeavenlyBodyChallenge planet : planets){
            //System.out.println(planet.getName()+": "+planet.getOrbitalPeriod());
            System.out.println(planet);
        }
        HeavenlyBodyChallenge earth1 =new Planet("Earth",365);
        HeavenlyBodyChallenge earth2 =new Planet("Earth",365);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(pluto.equals(earth2));
        System.out.println(earth2.equals(pluto));
    }


    }
