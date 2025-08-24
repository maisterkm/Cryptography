package org.example.ceasarcipher.bruteforce;

import org.example.cipher.CeasarCipher;
import org.example.cipher.CeasarCipherBruteForce;

public class App
{
    public static void main( String[] args )
    {

        String text = "WKLVCLVCMXVWCDQCH DPSOH";

        CeasarCipherBruteForce cracker = new CeasarCipherBruteForce();
        cracker.crack(text);
    }
}
