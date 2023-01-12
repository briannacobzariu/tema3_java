package org.example;

public class Adresa {
    String tara;

    public Adresa(String tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Adresa " + tara;
    }
}