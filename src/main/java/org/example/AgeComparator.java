package org.example;
import java.util.Comparator;

public class AgeComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2) {
        return p1.getVarsta() - p2.getVarsta();
    }
}