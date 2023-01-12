package org.example;
import java.util.Comparator;

public class NameComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2) {
        return p1.getNume().compareTo(p2.getNume());

    }
}