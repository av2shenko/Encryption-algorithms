package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String source = "The action of a Caesar cipher is to replace each plaintext letter with a different one a fixed number of places down the alphabet.";

        Counter counter = new Counter();

        Caesar caesar = new Caesar();
        String encryptedCaesar = caesar.Encrypt1(source);
        System.out.println("encrypted Caesar: " + encryptedCaesar);
        System.out.println("decrypted Caesar: " + caesar.Decrypt2(encryptedCaesar));
        counter.EncryptedCharacters(encryptedCaesar);

        Vigenere vigenere = new Vigenere();
        String keyVigenere = "qwerty";
        String encryptedVigenere = vigenere.Encrypt(source, keyVigenere);
        System.out.println("encrypted Vigenere: " + encryptedVigenere);
        System.out.println("decrypted Vigenere: " + vigenere.Decrypt(encryptedVigenere, keyVigenere));
        counter.EncryptedCharacters(encryptedVigenere);
    }
}
