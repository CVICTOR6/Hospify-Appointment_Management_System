package com.hospify.appointment.constants;

public enum Genotype {
    AA("AA"),
    AS("AS"),
    SS("SS"),
    AC("AC"),
    SC("SC"),
    CC("CC"),
    UNDEFINED("UNDEFINED");

    private final String genotype;

    Genotype(String genotype) {
        this.genotype = genotype;
    }

    public String getGenotype() {
        return genotype;
    }
}
