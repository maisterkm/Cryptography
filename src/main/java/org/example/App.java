package org.example;

import org.example.cipher.CeasarCipher;
import org.example.cipher.CeasarCipherBruteForce;

public class App
{
    public static void main( String[] args )
    {

        String text = "This is just an example";
        CeasarCipher cipher = new CeasarCipher();

        String cipherText = cipher.encrypt(text, 3);
        System.out.println(cipherText);

        System.out.println(cipher.decrypt(cipherText, 3));

        CeasarCipherBruteForce cracker = new CeasarCipherBruteForce();

    }
}
