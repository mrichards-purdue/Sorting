/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mrich
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class BubbleSort {
    // Optimized java implementation of Bubble sort
 public static void sortStrings(String[] arr, int n)
    {
        String temp;
 
        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
 
    // Driver code
    public static void main(String[] args) throws IOException
    {
         List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("10knumbers.txt"))) {
        String line = null;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
    }
        String[] words;
        words = lines.toArray(new String[0]);

        int n = words.length;
        sortStrings(words, n);
        System.out.println(
            "Strings in sorted order are : ");
        for (int i = 0; i < n; i++)
            System.out.println("String " + (i + 1) + " is "
                               + words[i]);
    }
}
 
// This code is contributed by
// sanjeev2552 from Geek2Geek
// The dataset was randomly generated using random.org