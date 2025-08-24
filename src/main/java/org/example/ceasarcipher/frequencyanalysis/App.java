package org.example.ceasarcipher.frequencyanalysis;

import org.example.cipher.CeasarCipher;
import org.example.cipher.CeasarCipherBruteForce;

public class App
{
    public static void main( String[] args )
    {

        String text = "My name is Kevin and I like software engineering!";
        FrequencyAnalysis analysis = new FrequencyAnalysis();
        analysis.showFrequencies(text);

    }
}