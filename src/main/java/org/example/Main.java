package org.example;
public class Main {

    public static void main(String[] args) {
        final int NUM_LOCKERS = 100;
        boolean[] lockers = new boolean[NUM_LOCKERS];

        // Process each student
        for (int student = 1; student <= NUM_LOCKERS; student++) {
            // Each student toggles lockers in a specific pattern
            for (int locker = student - 1; locker < NUM_LOCKERS; locker += student) {
                lockers[locker] = !lockers[locker];
            }
        }

        // Output the open lockers
        for (int i = 0; i < NUM_LOCKERS; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}