package com.example.programming2.lab6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Lab6 {
    private static final Random random = new Random();

    public static void main(String[] args) {

        // Task 2.1
        Comparator<Drug> ascendingTitleComparator = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());

        // Task 2.2
        Comparator<Drug> descendingTitleComparator = ascendingTitleComparator.reversed();

        // Task 2.3
        Comparator<Drug> improvedAscendingComparator = ascendingTitleComparator.thenComparing((o1, o2) -> Integer.compare(o1.getAmount(), o2.getAmount()));

        // Task 2.4
        Comparator<Drug> ascendingBySideAffectsNullsFirst = Comparator.nullsFirst((o1, o2) -> o1.getSideEffects().compareTo(o2.getSideEffects()));

        // Task 3
        Drug[] drugs = new Drug[]{
                new Drops("Awesome drops", random.nextInt(30) + 1, "Use it this way...", "Enlarged ears"),
                new Drops("Awesome drops", random.nextInt(30) + 1, "Use it this way...", "Enlarged ears"),
                new Drops("Even better drops", random.nextInt(30) + 1, "Use it this way...", "Enlarged nose"),
                new Pill("Weird-looking pills", random.nextInt(30) + 1, "Use it this way...", "Bigger hands"),
                new Pill("Become faster!", random.nextInt(30) + 1, "Use it this way...", "Become slower"),
                new Pill("Surprise!", random.nextInt(30) + 1, "Use it this way...", "TBD")
        };

        Arrays.sort(drugs, ascendingTitleComparator);
        System.out.println("Sorted by title, ascending:");
        for (Drug drug : drugs) {
            System.out.println(drug);
        }
        System.out.println("-----------------------------------------");

        Arrays.sort(drugs, descendingTitleComparator);
        System.out.println("Sorted by title, descending:");
        for (Drug drug : drugs) {
            System.out.println(drug);
        }
        System.out.println("-----------------------------------------");

        Arrays.sort(drugs, improvedAscendingComparator);
        System.out.println("Sorted by title, ascending improved:");
        for (Drug drug : drugs) {
            System.out.println(drug);
        }
        System.out.println("-----------------------------------------");

        drugs[random.nextInt(drugs.length)] = null;
        drugs[random.nextInt(drugs.length)] = null;
        drugs[random.nextInt(drugs.length)] = null;
        Arrays.sort(drugs, ascendingBySideAffectsNullsFirst);
        System.out.println("Sorted by side effects, ascending nulls first:");
        for (Drug drug : drugs) {
            System.out.println(drug);
        }
        System.out.println("-----------------------------------------");
    }
}
