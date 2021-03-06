package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Caesar {

    private final int offset = 3;

    public String Encrypt1(String source) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            String s = source.toUpperCase();
            char temp = s.charAt(i);
            if (temp >= 'A' && temp <= 'Z')
                stringBuilder.append((char) ((temp - 'A' + offset) % 26 + 'A'));
            else if (temp == ' ')
                stringBuilder.append(temp);
        }
        return stringBuilder.toString();
    }

    public String Decrypt1(String source) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char temp = source.charAt(i);
            if (temp >= 'A' && temp <= 'Z') {
                if (temp - 'A' - offset < 0) temp += 26;
                stringBuilder.append((char) (temp - offset));
            } else if (temp == ' ')
                stringBuilder.append(temp);
            else
                stringBuilder.append((char) (temp - offset));
        }
        return stringBuilder.toString();
    }

    public String Encrypt2(String source) throws IOException {
        if (source == null) return "";
        String s = source.toUpperCase();
        StringReader stringReader = new StringReader(s);
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        StringBuilder stringBuilder = new StringBuilder();
        String f = bufferedReader.readLine();
        for (char c : f.toCharArray()
        ) {
            if (c >= 'A' && c <= 'Z')
                stringBuilder.append((char) (c + offset));
            else if (c == ' ')
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public String Decrypt2(String source) throws IOException {
        if (source == null) return "";
        StringReader stringReader = new StringReader(source);
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        StringBuilder stringBuilder = new StringBuilder();
        String f = bufferedReader.readLine();
        for (char c : f.toCharArray()
        ) {
            if (c >= 'A' && c <= 'Z')
                stringBuilder.append((char) (c - offset));
            else if (c == ' ')
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
