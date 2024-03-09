package com.sony;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "AAAAABBCCAA";
        String result = compressString(s);
        System.out.println(result); // Output: 5A2B2A
    }

    public static String compressString(String s) {
        StringBuilder compressed = new StringBuilder();
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Build the compressed string
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                compressed.append(entry.getValue());
            }
            compressed.append(entry.getKey());
        }

        return compressed.toString();
    }
}
