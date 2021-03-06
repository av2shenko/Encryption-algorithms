package com.company;

import java.util.HashMap;
import java.util.Map;

public class Counter {

    public void EncryptedCharacters(String encrypted) {
        float totalCount = encrypted.length();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < encrypted.length(); i++) {
            String temp = (encrypted.substring(i, i + 1));
            map.computeIfPresent(temp, (key, value) -> value + 1);
            map.putIfAbsent(temp, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " - " + value + ", " + value / totalCount * 100 + " %");
        }
        System.out.println("totalCount - " + map.size());
    }
}
