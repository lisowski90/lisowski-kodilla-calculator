package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countryList = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountryList() {
        return countryList;
    }

}
