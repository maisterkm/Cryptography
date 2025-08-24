package org.example.ceasarcipher.frequencyanalysisceasarcrack;

import java.util.Map;

public class CrackCeasar {

    private FrequencyAnalysis frequencyAnalysis;

    public CrackCeasar() {
        frequencyAnalysis = new FrequencyAnalysis();
    }

    public void crackCeasar(String cipherText) {
        Map<Character, Integer> letterFrequencies = frequencyAnalysis.run(cipherText);

        Map.Entry<Character, Integer> maxEntry = null;

        for(Map.Entry<Character, Integer> entry : letterFrequencies.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        char mostFrequentChar = maxEntry.getKey();

        int approximatedKey = Constants.ALPHABET.indexOf(mostFrequentChar) - Constants.ALPHABET.indexOf('E');
    }

}
