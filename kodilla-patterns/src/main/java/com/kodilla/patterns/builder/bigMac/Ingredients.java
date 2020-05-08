package com.kodilla.patterns.builder.bigMac;

public class Ingredients {
    private final static String LETTUCE = "LETTUCE";
    private final static String ONION = "ONION";
    private final static String BECON = "BECON";
    private final static String PICKLES = "PICKLES";
    private final static String CHILI = "CHILI";
    private final static String SHRIMPS = "SHRIMPS";
    private final static String MUSHROOMS = "MUSHROOMS";
    private final static String CHEESE = "CHEESE";
    private final String ingredient;

    public Ingredients(String ingredient) {
        if(ingredient == LETTUCE || ingredient == ONION || ingredient == BECON || ingredient == PICKLES || ingredient == CHILI
        || ingredient == SHRIMPS || ingredient == MUSHROOMS || ingredient == CHEESE) {
            this.ingredient = ingredient;
        } else {
            throw new IllegalStateException("Other ingredient? Are You serious?");
        }
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "ingredient='" + ingredient + '\'' +
                '}';
    }
}
