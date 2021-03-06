package com.company;

public class Vigenere {

    private final int offset = (int) 'A';
    private final int alphabetSize = 26;

    public String Encrypt(String source, String key) {
        String encrypt = "";
        for (int i = 0; i < source.length(); i++) {
            String s = source.toUpperCase();
            String k = key.toUpperCase();
            char temp = s.charAt(i);
            if (temp == ' ')
                encrypt += (char) (32);
            else if (temp >= 'A' && temp <= 'Z')
                encrypt += (char) (((temp + k.charAt(i % k.length()) - 2 * offset) % alphabetSize) + offset);
        }
        return encrypt;
    }

    public String Decrypt(String source, String key) {
        String decrypt = "";
        for (int i = 0; i < source.length(); i++) {
            String k = key.toUpperCase();
            char temp = source.charAt(i);
            if (temp == ' ')
                decrypt += (char) (32);
            else if (temp >= 'A' && temp <= 'Z')
                decrypt += (char) (((temp - k.charAt(i % k.length()) + alphabetSize) % alphabetSize) + offset);
        }
        return decrypt;
    }
}
