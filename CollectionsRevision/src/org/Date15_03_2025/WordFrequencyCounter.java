package org.Date15_03_2025;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String str = sc.nextLine();
        sc.close();
        countWordFrequency(str);
    }    

    public static void countWordFrequency(String text) {
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        String[] words = text.split("\\s+");
        
        Map<String, Integer> map = new TreeMap<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {  
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(  entry.getKey() + "\t " + entry.getValue());
        }
    }
}
