package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeSet<Persoana> persoaneNume = new TreeSet<>(new NameComparator ());


        TreeSet<Persoana> persoaneVarsta = new TreeSet<>(new AgeComparator());


        persoaneNume.add(new Persoana("John", 25));
        persoaneNume.add(new Persoana("Adam", 30));
        persoaneNume.add(new Persoana("Jane", 20));
        persoaneNume.add(new Persoana("Tom", 35));

        persoaneVarsta.add(new Persoana("John", 25));
        persoaneVarsta.add(new Persoana("Adam", 30));
        persoaneVarsta.add(new Persoana("Jane", 20));
        persoaneVarsta.add(new Persoana("Tom", 35));

        // Iterating through the TreeSet and printing the name and age
        System.out.println("By Name:");
        for (Persoana persoana : persoaneNume) {
            System.out.println(persoana.getNume() + " " + persoana.getVarsta());
        }

        System.out.println("By Age:");
        for (Persoana persoana : persoaneVarsta) {
            System.out.println(persoana.getNume() + " " + persoana.getVarsta());
        }
        HashMap<Persoana, List<Hobby>> hobbies = new HashMap<>();

        ArrayList<String> addresses1 = new ArrayList<String>();
        addresses1.add("USA");
        addresses1.add("UK");
        Hobby hobby1 = new Hobby("Cycling", 2, addresses1);

        ArrayList<String> addresses2 = new ArrayList<String>();
        addresses2.add("India");
        addresses2.add("Australia");
        Hobby hobby2 = new Hobby("Swimming", 3, addresses2);

        Persoana persoana1 = new Persoana("John", 30);
        Persoana persoana2 = new Persoana("Jane", 25);

        List<Hobby> johnsHobbies = new ArrayList<>();
        johnsHobbies.add(hobby1);
        johnsHobbies.add(hobby2);

        hobbies.put(persoana1, johnsHobbies);

        List<Hobby> janesHobbies = new ArrayList<>();
        janesHobbies.add(hobby1);

        hobbies.put(persoana2, janesHobbies);

        Persoana target = new Persoana("John", 30);
        List<Hobby> targetHobbies = hobbies.get(target);

        System.out.println("Hobbies of " + target.getNume() + ":");
        for (Hobby hobby : targetHobbies) {
            System.out.println("- " + hobby.getName() + " (Practiced " + hobby.getFrequency() + " times a week)");
            System.out.println("  Can be practiced at: " + hobby.getAddresses());
        }
    }
}
