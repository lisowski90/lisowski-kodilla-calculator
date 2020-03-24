package com.kodilla.exception.test;


public class FlyScannerExe {
    public static  void main(String[] args) {
        Flight flight1 = new Flight("Z8", "C6");
        Flight flight2 = new Flight("A1", "X8");
        Flight flight3 = new Flight("K2", "S0");
        FlyScanner flyScanner1 = new FlyScanner();
        FlyScanner flyScanner2 = new FlyScanner();
        FlyScanner flyScanner3 = new FlyScanner();

        try {
            flyScanner1.findFlight(flight1);
            System.out.println("Search completed flight from " + flight1.getDepartureAirport() + " to " + flight1.getArrivalAirport());
        } catch (RouteNotFoundException e) {
            System.out.println("Search failed " + flight1.getDepartureAirport() + " or " + flight1.getArrivalAirport() + " not found");
        }

        try {
            flyScanner2.findFlight(flight2);
            System.out.println("Search completed flight from " + flight2.getDepartureAirport() + " to " + flight2.getArrivalAirport());
        } catch (RouteNotFoundException e) {
            System.out.println("Search failed " + flight2.getDepartureAirport() + " or " + flight2.getArrivalAirport() + " not found");
        }

        try {
            flyScanner3.findFlight(flight3);
            System.out.println("Search completed flight from " + flight3.getDepartureAirport() + " to " + flight3.getArrivalAirport());
        } catch (RouteNotFoundException e) {
            System.out.println("Search failed " + flight3.getDepartureAirport() + " or " + flight3.getArrivalAirport() + " not found");
        }

    }
}
