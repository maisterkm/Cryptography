package org.example.ceasarcipher.frequencyanalysisceasarcrack;

import org.example.cipher.CeasarCipher;

public class App {

    public static void main(String[] args) {
        String text = "My name is Kevin and I am working as a software engineer at a multinational company and my main interest are algorithms and machine learning";
        CeasarCipher ceasarCipher = new CeasarCipher();

        String cipherText = ceasarCipher.encrypt(text, 10);
        System.out.println(cipherText);

        System.out.println(ceasarCipher.decrypt(cipherText, 10));

        String cipher = "PACQDPHCLVCNHYLQCDQGCLCDPCZRUNLQJCDVCDCVRIWZDUHCHQJLQHHUCDWCDCPXOWLQDWLRQDOCFRPSDQACDQGCPACPDLQCLQWHUHVWCDUHCDOJRULWKPVCDQGCPDFKLQHCOHDUQLQJ";
        CrackCeasar cracker = new CrackCeasar();
        cracker.crackCeasar(cipher);
    }
}
