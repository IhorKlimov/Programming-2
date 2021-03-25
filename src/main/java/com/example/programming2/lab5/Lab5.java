package com.example.programming2.lab5;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        try {
            List<String> rarestWords = rarestWords("words.txt");
            System.out.println("Rarest words are: "+ listToString(rarestWords));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> rarestWords(String filename) throws IOException {
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException("Wrong fileName passed");
        }

        List<String> result = new ArrayList<>();
        StringBuilder file = new StringBuilder();

        try (FileReader fr = new FileReader(filename);) {
            int i;
            while ((i = fr.read()) != -1) {
                char character = (char) i;
                file.append(character);
            }
        }
        String[] words = file.toString().replaceAll("\n", " ").split(" ");

        HashMap<String, Integer> counter = new HashMap<>();

        for (String word : words) {
            int currentCount = counter.getOrDefault(word, 0);
            counter.put(word, currentCount + 1);
        }

        int numberOfMentionsOfRarestWord = findNumberOfMentionsOfRarestWord(counter);
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == numberOfMentionsOfRarestWord) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    private static int findNumberOfMentionsOfRarestWord(HashMap<String, Integer> counter) {
        ArrayList<Integer> counts = new ArrayList<>(counter.values());
        counts.sort(Comparator.naturalOrder());
        return counts.get(0);
    }

    private static String listToString(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
            if (i != list.size() - 1) {
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.toString();
    }

}
