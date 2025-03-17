package main;

import java.util.*;

class ChampionshipManager {
    private static ChampionshipManager instance;

    
    private List<Driver> drivers;
    private List<RallyRaceResult> races;
    private static int totalDrivers = 0;
    private static int totalRaces = 0;

   
    private ChampionshipManager() {
        drivers = new ArrayList<>();
        races = new ArrayList<>();
    }

   
    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

   
    public void registerDriver(Driver driver) {
        drivers.add(driver);
        totalDrivers++;
    }

    public void addRaceResult(RallyRaceResult result) {
        races.add(result);
        totalRaces++;
    }

    public List<Driver> getStandings() {
        drivers.sort((d1, d2) -> d2.getPoints() - d1.getPoints());
        return drivers;
    }

    public Driver getLeadingDriver() {
        return getStandings().get(0);
    }

    public static int getTotalDrivers() {
        return totalDrivers;
    }

    public static int getTotalRaces() {
        return totalRaces;
    }
}



