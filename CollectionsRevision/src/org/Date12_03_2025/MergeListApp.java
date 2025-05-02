package org.Date12_03_2025;

import java.util.*;

public class MergeListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 elements for list1:");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter 5 elements for list2:");
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }

        Set<Integer> set = new HashSet<>(list);
        set.addAll(list1);

        List<Integer> l = new ArrayList<>(set);
        Collections.sort(l);

        System.out.println("Merged List without duplicates: " + l);
    }
}
