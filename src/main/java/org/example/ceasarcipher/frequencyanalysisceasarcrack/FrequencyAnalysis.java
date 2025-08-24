package org.example.ceasarcipher.frequencyanalysisceasarcrack;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {
    public Map<Character, Integer> run(String text) {

        text = text.toUpperCase();

        Map<Character, Integer> letterFrequencies = new HashMap<>();
        for(int i=0; i<text.length(); ++i) {
            char c = text.charAt(i);

            if(Constants.ALPHABET.indexOf(c) != -1) {
                letterFrequencies.put(c, letterFrequencies.getOrDefault(c, 0) + 1);
            }
        }
        return letterFrequencies;
    }
}
