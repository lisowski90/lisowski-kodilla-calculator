package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlyScanner {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("A1", false);
        airportList.put("A2", true);
        airportList.put("K2", true);
        airportList.put("Z6", false);
        airportList.put("S0", true);

        boolean arrivalAirport = airportList.containsKey(flight.getArrivalAirport());
        boolean departureAirport = airportList.containsKey(flight.getDepartureAirport());

        if(!arrivalAirport || !departureAirport) {
            throw new RouteNotFoundException();
        }
    }
}

