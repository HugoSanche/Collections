import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {
    private static Map<HeavenlyBodyChallenge.Key,HeavenlyBodyChallenge> solarSystem=new HashMap<>();
    private static Set<HeavenlyBodyChallenge> planets=new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBodyChallenge temp=new Planet("Mercury",88);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp=new Planet("Venus",225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp=new Planet("Earth",365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBodyChallenge tempMoon=new Moon("Moon",27);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);

        temp=new Planet("Mars",687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon=new Moon("Deimos",1.3);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Mars

        temp=new Planet("Jupiter",4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon=new Moon("Io",1.8);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        tempMoon=new Moon("Europa",3.5);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        tempMoon=new Moon("Ganymede",7.1);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        tempMoon=new Moon("Callisto",16.7);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);//temp is still Jupiter

        temp=new Planet("Saturn",10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp=new Planet("Uranus",30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp=new Planet("Neptune",165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp=new Planet("Pluto",248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBodyChallenge body =solarSystem.get(HeavenlyBodyChallenge.makeKey("Jupiter",BodyType.PLANET));
        System.out.println("Moons of "+body.getKey());
        for (HeavenlyBodyChallenge jupiterMoon: body.getSatellites()){
            System.out.println("\t"+jupiterMoon.getKey());
        }


        System.out.println("Planets with satellites");
        for(HeavenlyBodyChallenge planet : planets){
            System.out.println("\t"+planet.getKey());

            for (HeavenlyBodyChallenge lunas :planet.getSatellites()){
                System.out.println("\t \t Moons "+lunas.getKey());
            }
        }


        Set<HeavenlyBodyChallenge> moons=new HashSet<>();
        for (HeavenlyBodyChallenge lunas :planets){
            moons.addAll(lunas.getSatellites());
        }

        System.out.println("List of Planets");
        for(HeavenlyBodyChallenge planet : planets){
            //System.out.println(planet.getKey()+": "+planet.getOrbitalPeriod());
            System.out.println("\t"+planet);
        }

        System.out.println("\nList of Moons:");
        for (HeavenlyBodyChallenge moon :moons ){
            System.out.println("\t"+moon.getKey());
        }

        HeavenlyBodyChallenge pluto =new DwarfPlanet("Pluto",842);
        planets.add(pluto);


        HeavenlyBodyChallenge earth1 =new Planet("Earth",365);
        HeavenlyBodyChallenge earth2 =new Planet("Earth",365);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(pluto.equals(earth2));
        System.out.println(earth2.equals(pluto));

        solarSystem.put(pluto.getKey(),pluto);
        System.out.println(solarSystem.get(HeavenlyBodyChallenge.makeKey("Pluto",BodyType.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBodyChallenge.makeKey("Pluto",BodyType.DWARF_PLANET)));
        System.out.println(solarSystem.get(HeavenlyBodyChallenge.makeKey("Mercury",BodyType.PLANET)));

        System.out.println();
        System.out.println("The solar System Contains");
        for(HeavenlyBodyChallenge solarSystem: solarSystem.values()){//example how you print a MAP
            System.out.println(solarSystem);
        }
    }

    }

