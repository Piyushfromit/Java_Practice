package org.example;

import java.util.function.Supplier;

public class Main3 {
    public static void main(String[] args) {
        // Supplier to generate a random integer between 1 and 100
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;

        // Get a random number from the supplier
        int randomNumber = randomNumberSupplier.get();
        System.out.println("Random number: " + randomNumber); // Random number: 38

    }
}