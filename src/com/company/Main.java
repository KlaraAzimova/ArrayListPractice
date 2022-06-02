package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> takSandar = new ArrayList<>();
        ArrayList<Integer> jupSan = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 100));
            if (numbers.get(i) % 2 == 1) {
                takSandar.add(numbers.get(i));
            } else {
                jupSan.add(numbers.get(i));
            }
        }
        System.out.println("Random sandar: " + numbers);
        System.out.println("Tak sandar: " + takSandar);
        System.out.println("Jup sandar: " + jupSan);


    }

}
