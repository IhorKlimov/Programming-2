package com.example.programming2.lab7;


import java.util.ArrayList;
import java.util.Random;

public class Lab7 {
    private static final Random random = new Random();

    public static void main(String[] args) {

        // Task 2
        Task task19 = (a, b, c, d) -> {
            System.out.println("Task 19. Got input: a=" + a + " b=" + b + " c=" + c + " d=" + d);
            double y = Math.pow((Math.tan(a)), 1.0 / c) / (1 + (Math.cosh(b) / Math.log(d + c)));
            System.out.println("Task 19. Calculated result: " + y);
            return y;
        };
        Task task20 = (a, b, c, d) -> {
            System.out.println("Task 20. Got input: a=" + a + " b=" + b + " c=" + c + " d=" + d);
            double y = 2 * Math.log(Math.pow(b, a)) + Math.abs(Math.asin(-Math.sqrt(d / c)));
            System.out.println("Task 20. Calculated result: " + y);
            return y;
        };
        Task task21 = (a, b, c, d) -> {
            System.out.println("Task 21. Got input: a=" + a + " b=" + b + " c=" + c + " d=" + d);
            double y = 3 * (Math.log(a / b) + Math.sqrt(Math.cos(c) + Math.pow(Math.E, d)));
            System.out.println("Task 21. Calculated result: " + y);
            return y;
        };

        task19.calculate(1.234, -3.12, 5.45, 2.0);
        task20.calculate(3.56, 1.02, 3.0, 2.43);
        task21.calculate(1.54, 1.23, -2.14, -0.23);


        // Task 3
        ArrayList<Drug> drugs = new ArrayList<>();
        drugs.add(new Drops("Awesome drops", random.nextInt(30) + 1, "Use it this way...", "Enlarged ears"));
        drugs.add(new Drops("Even better drops", random.nextInt(30) + 1, "Use it this way...", "Enlarged nose"));
        drugs.add(new Pill("Weird-looking pills", random.nextInt(30) + 1, "Use it this way...", "Bigger hands"));
        drugs.add(new Pill("Surprise!", random.nextInt(30) + 1, "Use it this way...", "TBD"));

        drugs.forEach(System.out::println);
    }
}
