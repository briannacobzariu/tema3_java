package org.example;
import java.util.*;
public class Hobby {
    private String name;
    private int frequency;
    private List<String> addresses;

    public Hobby(String name, int frequency, List<String> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<String> getAddresses() {
        return addresses;
    }
}
