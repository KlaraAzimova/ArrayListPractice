package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Datka");
//        names.add("Nurmuhammed");
//        names.add("Aizada");
//        names.add("Dastan");
//        System.out.println(names.size());
//
//        String student = names.get(3);
//        System.out.println(student);
//
//        names.add(2, "Nurtilek");
//        System.out.println(names);
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
//        for (int i = 0; i < 25; i++) {
//            nums.add(random.nextInt(50));
//            System.out.print(nums.get(i) + " ");
//        }
//        System.out.println();
//        System.out.print("Tak sandar: ");
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) % 2 == 1) {
//                takSandar.add(nums.get(i));
//                System.out.print(nums.get(i) + " ");
//
//            }
//        }
//        System.out.println();
//        System.out.print("Jup san: ");
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) % 2 == 0) {
//                jupSan.add(nums.get(i));
//                System.out.print(nums.get(i) + " ");
//            }
//        }

    }

}
