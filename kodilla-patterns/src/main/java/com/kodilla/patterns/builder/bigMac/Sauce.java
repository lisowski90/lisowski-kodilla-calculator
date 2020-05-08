package com.kodilla.patterns.builder.bigMac;

public class Sauce {
    private final static String STANDARD = "STANDARD";
    private final static String BARBECUE = "BARBECUE";
    private final static String SAUCE1000 = "SAUCE1000";
    private final String withSauce;

    public Sauce(String withSauce) {
        if(withSauce == STANDARD || withSauce == BARBECUE || withSauce == SAUCE1000) {
            this.withSauce = withSauce;
        } else {
            throw new IllegalStateException("We don't have sauce You want :(");
        }
    }

    public String getWithSauce() {
        return withSauce;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "withSauce='" + withSauce + '\'' +
                '}';
    }
}
