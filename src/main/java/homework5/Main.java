package homework5;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Artamonov Aleksandr
 */

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> words = new TreeMap<>();
        int repeat = 0;

        try (BufferedReader fileReader = new BufferedReader(new FileReader("D:\\Text.txt"))) {
            String line = fileReader.readLine();
            String[] splitLine;

            while (line != null) {
                splitLine = line.split(" ");
                for (String word : splitLine) {
                    if (words.containsKey(word)) {
                        words.put(word, words.get(word) + 1);
                        if (words.get(word) > repeat) {
                            repeat = words.get(word);
                        }
                    } else words.put(word, 1);
                }
                line = fileReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println("Слово \"" + entry.getKey() + "\" встречается " + entry.getValue() + " раз");
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() == repeat) {
                System.out.println("\nСлово \"" + entry.getKey() + "\" встречается " + entry.getValue() + " раз");
            }
        }
    }
}
