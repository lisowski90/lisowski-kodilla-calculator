package com.kodilla.patterns.builder.bigMac;

public class Bun {
    private final static String SESAME = "SESAME";
    private final static String NOSESAME = "NOSESAME";
    final private String isSesame;

    public Bun(String isSesame) {
        if(isSesame == SESAME || isSesame == NOSESAME) {
            this.isSesame = isSesame;
        } else {
            throw new IllegalStateException("We don't have this bun :(");
        }
    }

    public String getIsSesame() {
        return isSesame;
    }

    @Override
    public String toString() {
        return "Bun{" +
                "isSesame='" + isSesame + '\'' +
                '}';
    }
}
